; FUN_0092a7d4 @ 0092a7d4
0092a7d4	stp x29,x30,[sp, #-0x10]!
0092a7d8	mov x29,sp
0092a7dc	and w0,w0,#0xff
0092a7e0	bl 0x00c30900
0092a7e4	cmn w0,#0x1
0092a7e8	cset w0,eq
0092a7ec	ldp x29,x30,[sp], #0x10
0092a7f0	ret
