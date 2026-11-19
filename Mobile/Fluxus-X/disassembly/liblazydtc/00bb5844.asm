; HUF_decompress1X1_DCtx_wksp @ 00bb5844
00bb5844	stp x29,x30,[sp, #-0x40]!
00bb5848	str x23,[sp, #0x10]
00bb584c	stp x22,x21,[sp, #0x20]
00bb5850	stp x20,x19,[sp, #0x30]
00bb5854	mov x29,sp
00bb5858	mov x23,x4
00bb585c	mov x21,x3
00bb5860	mov x20,x2
00bb5864	mov x22,x1
00bb5868	mov x1,x3
00bb586c	mov x2,x4
00bb5870	mov x3,x5
00bb5874	mov x4,x6
00bb5878	mov w5,w7
00bb587c	mov x19,x0
00bb5880	bl 0x00c43510
00bb5884	cmn x0,#0x78
00bb5888	b.hi 0x00bb58bc
00bb588c	subs x3,x23,x0
00bb5890	b.ls 0x00bb58b8
00bb5894	add x2,x21,x0
00bb5898	mov x0,x22
00bb589c	mov x1,x20
00bb58a0	mov x4,x19
00bb58a4	ldp x20,x19,[sp, #0x30]
00bb58a8	ldr x23,[sp, #0x10]
00bb58ac	ldp x22,x21,[sp, #0x20]
00bb58b0	ldp x29,x30,[sp], #0x40
00bb58b4	b 0x00bb58e0
00bb58b8	mov x0,#-0x48
00bb58bc	ldp x20,x19,[sp, #0x30]
00bb58c0	ldr x23,[sp, #0x10]
00bb58c4	ldp x22,x21,[sp, #0x20]
00bb58c8	ldp x29,x30,[sp], #0x40
00bb58cc	ret
