; FUN_0089dcbc @ 0089dcbc
0089dcbc	ldp x9,x8,[x0]
0089dcc0	orr x10,xzr,#-0x3333333333333334
0089dcc4	movk x10,#0xcccd
0089dcc8	sub x8,x8,x9
0089dccc	asr x8,x8,#0x3
0089dcd0	mul x8,x8,x10
0089dcd4	subs x8,x1,x8
0089dcd8	b.ls 0x0089dce4
0089dcdc	mov x1,x8
0089dce0	b 0x0089f5cc
0089dce4	b.cs 0x0089dcf4
0089dce8	mov w8,#0x28
0089dcec	madd x8,x1,x8,x9
0089dcf0	str x8,[x0, #0x8]
0089dcf4	ret
