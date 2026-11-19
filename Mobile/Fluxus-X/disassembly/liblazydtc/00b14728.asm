; X509_VERIFY_PARAM_set1_ip_asc @ 00b14728
00b14728	sub sp,sp,#0x30
00b1472c	str x19,[sp, #0x10]
00b14730	mov x19,x0
00b14734	mov x0,sp
00b14738	stp x29,x30,[sp, #0x20]
00b1473c	add x29,sp,#0x20
00b14740	bl 0x00c408a0
00b14744	cbz w0,0x00b14758
00b14748	sxtw x2,w0
00b1474c	mov x1,sp
00b14750	mov x0,x19
00b14754	bl 0x00b14240
00b14758	ldp x29,x30,[sp, #0x20]
00b1475c	ldr x19,[sp, #0x10]
00b14760	add sp,sp,#0x30
00b14764	ret
