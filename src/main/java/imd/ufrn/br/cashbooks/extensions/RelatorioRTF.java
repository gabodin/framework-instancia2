package imd.ufrn.br.cashbooks.extensions;

import java.time.format.DateTimeFormatter;
import java.util.List;

import imd.ufrn.br.cashbooks.interfaces.IGerarRelatorio;
import imd.ufrn.br.cashbooks.model.Movimentacao;

public class RelatorioRTF implements IGerarRelatorio {
	
	@Override
	public String gerarRelatorio(List<Movimentacao> movimentacoes) {
		String rtfText = "{\\rtf1\\ansi\\ansicpg1252\\uc0\\stshfdbch0\\stshfloch0\\stshfhich0\\stshfbi0\\deff0\\adeff0{\\fonttbl{\\f0\\fnil\\fcharset0 Times New Roman;}{\\f1\\fnil\\fcharset0 Calibri;}{\\f2\\fnil\\fcharset0 Calibri Light;}}{\\colortbl;\\red47\\green84\\blue150;\\red31\\green55\\blue99;}\\noqfpromote{\\stylesheet{\\s0\\snext0\\styrsid8412110\\sqformat\\spriority0\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\afs24\\ltrch\\fs24 Normal;}{\\s1\\sbasedon0\\snext0\\slink15\\styrsid5270906\\sqformat\\spriority9\\keep\\keepn\\sb240\\sa0\n" + 
				"\\aspalpha\\aspnum\\adjustright\\outlinelevel0\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\af0\\afs48\\ltrch\\b\\i0\\fs48\\f0\\cf1\\kerning36 heading 1;}{\\s2\\sbasedon0\\snext0\\slink16\\styrsid5270906\\sqformat\\spriority9\\keep\\keepn\\sb40\\sa0\\aspalpha\\aspnum\\adjustright\\outlinelevel1\n" + 
				"\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\af0\\afs36\\ltrch\\b\\i0\\fs36\\f0\\cf1 heading 2;}{\\s3\\sbasedon0\\snext0\\slink17\\styrsid5270906\\sqformat\\spriority9\\keep\\keepn\\sb40\\sa0\\aspalpha\\aspnum\\adjustright\\outlinelevel2\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\af0\\afs28\n" + 
				"\\ltrch\\b\\i0\\fs28\\f0\\cf2 heading 3;}{\\s4\\sbasedon0\\snext0\\slink18\\styrsid5270906\\sqformat\\spriority9\\keep\\keepn\\sb40\\sa0\\aspalpha\\aspnum\\adjustright\\outlinelevel3\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\ai\\af0\\afs24\\ltrch\\b\\i0\\fs24\\f0\\cf1 heading 4;}{\\s5\\sbasedon0\\snext0\\slink19\\styrsid5270906\n" + 
				"\\sqformat\\spriority9\\keep\\keepn\\sb40\\sa0\\aspalpha\\aspnum\\adjustright\\outlinelevel4\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\af0\\afs20\\ltrch\\b\\i0\\fs20\\f0\\cf1 heading 5;}{\\s6\\sbasedon0\\snext0\\slink20\\styrsid5270906\\sqformat\\spriority9\\keep\\keepn\\sb40\\sa0\n" + 
				"\\aspalpha\\aspnum\\adjustright\\outlinelevel5\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\ab\\af0\\afs16\\ltrch\\b\\i0\\fs16\\f0\\cf2 heading 6;}{\\*\\cs10\\additive\\ssemihidden\\spriority0 Default Paragraph Font;}{\\*\\cs15\\additive\\sbasedon10\\slink1\\styrsid5270906\\spriority9\n" + 
				"\\rtlch\\af0\\afs32\\ltrch\\fs32\\f2\\cf1 Heading 1 Char;}{\\*\\cs16\\additive\\sbasedon10\\slink2\\styrsid5270906\\spriority9\\rtlch\\af0\\afs26\\ltrch\\fs26\\f2\\cf1 Heading 2 Char;}{\\*\\cs17\\additive\\sbasedon10\\slink3\\styrsid5270906\\spriority9\\rtlch\\af0\\afs24\\ltrch\\fs24\\f2\\cf2 Heading 3 Char;\n" + 
				"}{\\*\\cs18\\additive\\sbasedon10\\slink4\\styrsid5270906\\spriority9\\rtlch\\ai\\af0\\ltrch\\i\\f2\\cf1 Heading 4 Char;}{\\*\\cs19\\additive\\sbasedon10\\slink5\\styrsid5270906\\spriority9\\rtlch\\af0\\ltrch\\f2\\cf1 Heading 5 Char;}{\\*\\cs20\\additive\\sbasedon10\\slink6\\styrsid5270906\\spriority9\n" + 
				"\\rtlch\\af0\\ltrch\\f2\\cf2 Heading 6 Char;}{\\s21\\sbasedon0\\snext21\\spriority0\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\rtlch\\afs24\\ltrch\\fs24 div_Section1;}{\\s22\\sbasedon0\\snext22\\spriority0\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\n" + 
				"\\ql\\faauto\\sl322\\slmult1\\rtlch\\ab\\af0\\afs40\\ltrch\\b\\fs40\\f0 p_para001;}{\\*\\cs23\\additive\\sbasedon10\\spriority0\\rtlch\\af1\\ltrch\\loch\\af1\\dbch\\af1\\hich\\f1 span_text001;}{\\s24\\sbasedon0\\snext24\\spriority0\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\n" + 
				"\\ql\\faauto\\sl322\\slmult1\\rtlch\\af0\\afs24\\ltrch\\fs24\\f0 p_para002;}{\\*\\cs25\\additive\\sbasedon10\\spriority0\\rtlch\\af1\\ltrch\\loch\\af1\\dbch\\af1\\hich\\f1 span_text002;}}{\\*\\generator Aspose.Words for .NET 21.6.0;}{\\info\\version0\\edmins0\\nofpages0\\nofwords0\\nofchars0\\nofcharsws0}\n" + 
				"{\\mmathPr\\mbrkBin0\\mbrkBinSub0\\mdefJc1\\mdispDef1\\minterSp0\\mintLim0\\mintraSp0\\mlMargin0\\mmathFont0\\mnaryLim1\\mpostSp0\\mpreSp0\\mrMargin0\\msmallFrac0\\mwrapIndent1440\\mwrapRight0}\\deflang1033\\deflangfe2052\\adeflang1025\\jexpand\\showxmlerrors1\\validatexml1\\viewscale100\\fet0\n" + 
				"\\widowctrl\\nocxsptable\\nospaceforul\\nolnhtadjtbl\\alntblind\\lyttblrtgr\\nogrowautofit\\dntblnsbdb\\noxlattoyen\\wrppunct\\nobrkwrptbl\\expshrtn\\snaptogridincell\\asianbrkrule\\htmautsp\\noultrlspc\\useltbaln\\splytwnine\\ftnlytwnine\\lytcalctblwd\\allowfieldendsel\\newtblstyruls\n" + 
				"\\lnbrkrule\\nouicompat\\nofeaturethrottle1\\spltpgpar\\krnprsnet\\noindnmbrts\\usenormstyforlist\\felnbrelev\\indrlsweleven\\noafcnsttbl\\afelev\\utinl\\hwelev\\notcvasp\\notbrkcnstfrctbl\\notvatxbx\\cachedcolbal\\formshade\\nojkernpunct\\dghspace180\\dgvspace180\\dghorigin1800\\dgvorigin1440\\dghshow1\\dgvshow1\n" + 
				"\\dgmargin\\pgbrdrhead\\pgbrdrfoot\\rsidroot0\\sectd\\ltrsect\\pard\\plain\\itap0\\s22\\sb0\\sa200\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\sl322\\slmult1\\rtlch\\ab\\af0\\afs40\\ltrch\\b\\fs40\\f0{\\rtlch\\ab\\ai0\\af1\\alang1024\\afs40\\ltrch\\b\\i0\\fs40\\lang2057\\langnp2057\\langfe2057\\langfenp2057\n" + 
				"\\loch\\af1\\dbch\\af1\\hich\\f1\\cs23 MyFinances}{\\rtlch\\ab\\ai0\\af0\\alang1024\\afs40\\ltrch\\b\\i0\\fs40\\lang2057\\langnp2057\\langfe2057\\langfenp2057\\f0\\par}\\pard\\plain\\itap0\\s24\\sb0\\sa200\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\sl322\\slmult1\n" + 
				"\\rtlch\\af0\\afs24\\ltrch\\fs24\\f0{\\rtlch\\ab0\\ai0\\af1\\alang1024\\afs22\\ltrch\\b0\\i0\\fs22\\lang2057\\langnp2057\\langfe2057\\langfenp2057\\loch\\af1\\dbch\\af1\\hich\\f1\\cs25 Todas minhas movimenta\\'e7\\'f5es:}"; // Cabeçalho
		
		String iterationHeader = "{\\rtlch\\ab0\\ai0\\af0\\alang1024\\afs22\\ltrch\\b0\\i0\\fs22\\lang2057\\langnp2057\\langfe2057\\langfenp2057\\f0\\par}\\pard\\plain\\itap0\\s24\\sb0\\sa200\\aspalpha\\aspnum\\adjustright\\ltrpar\\li0\\lin0\\ri0\\rin0\\ql\\faauto\\sl322\\slmult1\\rtlch\\af0\\afs24\\ltrch\\fs24\\f0\n" + 
				"{\\rtlch\\ab0\\ai0\\af1\\alang1024\\afs22\\ltrch\\b0\\i0\\fs22\\lang2057\\langnp2057\\langfe2057\\langfenp2057\\loch\\af1\\dbch\\af1\\hich\\f1\\cs25 ";
		String iterationFooter = "}";
		
		for(int i = 0; i < movimentacoes.size(); i++) {
			rtfText += iterationHeader + 
					"Data: " + movimentacoes.get(i).getDataMovimentacao().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + 
					"; Valor: R$ " + String.format("%.2f", movimentacoes.get(i).getValor()) + 
					"; Data Cob.: " + movimentacoes.get(i).getDataCobranca().format(DateTimeFormatter.ofPattern("dd/MM/YYYY")) + 
					"; Status: " + movimentacoes.get(i).getStatus().name() + 
					"; Categoria: " + movimentacoes.get(i).getCategoria().name() + 
					"; Desc.: " + movimentacoes.get(i).getDescricao() + iterationFooter;
		}
		
		return rtfText + "{\\rtlch\\ab0\\ai0\\af0\\alang1024\\afs22\\ltrch\\b0\\i0\\fs22\\lang2057\\langnp2057\\langfe2057\\langfenp2057\\f0\\par}{\\*\\latentstyles\\lsdstimax267\\lsdlockeddef0\\lsdsemihiddendef1\\lsdunhideuseddef1\\lsdqformatdef0\\lsdprioritydef99{\\lsdlockedexcept}}}";
	}
	
}
