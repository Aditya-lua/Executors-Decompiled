; HUF_decompress1X2_DCtx_wksp @ 00bb5110
00bb5110	stp x29,x30,[sp, #-0x40]!
00bb5114	str x23,[sp, #0x10]
00bb5118	stp x22,x21,[sp, #0x20]
00bb511c	stp x20,x19,[sp, #0x30]
00bb5120	mov x29,sp
00bb5124	mov x23,x4
00bb5128	mov x21,x3
00bb512c	mov x20,x2
00bb5130	mov x22,x1
00bb5134	mov x1,x3
00bb5138	mov x2,x4
00bb513c	mov x3,x5
00bb5140	mov x4,x6
00bb5144	mov w5,w7
00bb5148	mov x19,x0
00bb514c	bl 0x00c43520
00bb5150	cmn x0,#0x78
00bb5154	b.hi 0x00bb5188
00bb5158	subs x3,x23,x0
00bb515c	b.ls 0x00bb5184
00bb5160	add x2,x21,x0
00bb5164	mov x0,x22
00bb5168	mov x1,x20
00bb516c	mov x4,x19
00bb5170	ldp x20,x19,[sp, #0x30]
00bb5174	ldr x23,[sp, #0x10]
00bb5178	ldp x22,x21,[sp, #0x20]
00bb517c	ldp x29,x30,[sp], #0x40
00bb5180	b 0x00bb519c
00bb5184	mov x0,#-0x48
00bb5188	ldp x20,x19,[sp, #0x30]
00bb518c	ldr x23,[sp, #0x10]
00bb5190	ldp x22,x21,[sp, #0x20]
00bb5194	ldp x29,x30,[sp], #0x40
00bb5198	ret
