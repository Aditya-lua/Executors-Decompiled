; FUN_00bf5288 @ 00bf5288
00bf5288	bti c
00bf528c	ldr x8,[x0]
00bf5290	cbz x8,0x00bf52b8
00bf5294	add x9,x0,#0x18
00bf5298	str x8,[x0, #0x8]
00bf529c	cmp x8,x9
00bf52a0	b.eq 0x00bf52b4
00bf52a4	ldr x9,[x0, #0x10]
00bf52a8	mov x0,x8
00bf52ac	sub x1,x9,x8
00bf52b0	b 0x00c2fe80
00bf52b4	strb wzr,[x0, #0x108]
00bf52b8	ret
