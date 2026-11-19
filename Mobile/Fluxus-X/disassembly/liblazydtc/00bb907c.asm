; HUF_decompress4X_hufOnly_wksp @ 00bb907c
00bb907c	stp x29,x30,[sp, #-0x40]!
00bb9080	stp x24,x23,[sp, #0x10]
00bb9084	stp x22,x21,[sp, #0x20]
00bb9088	stp x20,x19,[sp, #0x30]
00bb908c	mov x29,sp
00bb9090	cbz x2,0x00bb90b0
00bb9094	cbz x4,0x00bb90b8
00bb9098	cmp x4,x2
00bb909c	b.cs 0x00bb90c0
00bb90a0	lsl x8,x4,#0x4
00bb90a4	udiv x8,x8,x2
00bb90a8	mov w8,w8
00bb90ac	b 0x00bb90c4
00bb90b0	mov x0,#-0x46
00bb90b4	b 0x00bb9198
00bb90b8	mov x0,#-0x14
00bb90bc	b 0x00bb9198
00bb90c0	mov w8,#0xf
00bb90c4	adrp x9,0x789000
00bb90c8	add x9,x9,#0x1ac
00bb90cc	mov x19,x1
00bb90d0	add x8,x9,x8, LSL #0x4
00bb90d4	lsr x9,x2,#0x8
00bb90d8	mov x20,x2
00bb90dc	mov x21,x0
00bb90e0	mov x23,x3
00bb90e4	mov x1,x3
00bb90e8	ldp w11,w10,[x8, #0x8]
00bb90ec	ldp w8,w12,[x8]
00bb90f0	mov x24,x4
00bb90f4	mov x2,x4
00bb90f8	mov x3,x5
00bb90fc	madd w10,w10,w9,w11
00bb9100	mov x4,x6
00bb9104	mov w22,w7
00bb9108	madd w8,w12,w9,w8
00bb910c	mov w5,w7
00bb9110	add w9,w10,w10, LSR #0x5
00bb9114	cmp w9,w8
00bb9118	b.cs 0x00bb9158
00bb911c	bl 0x00c43520
00bb9120	cmn x0,#0x78
00bb9124	b.hi 0x00bb9198
00bb9128	subs x3,x24,x0
00bb912c	b.ls 0x00bb9194
00bb9130	add x2,x23,x0
00bb9134	mov x0,x19
00bb9138	mov x1,x20
00bb913c	mov x4,x21
00bb9140	mov w5,w22
00bb9144	ldp x20,x19,[sp, #0x30]
00bb9148	ldp x22,x21,[sp, #0x20]
00bb914c	ldp x24,x23,[sp, #0x10]
00bb9150	ldp x29,x30,[sp], #0x40
00bb9154	b 0x00bb5ba8
00bb9158	bl 0x00c43510
00bb915c	cmn x0,#0x78
00bb9160	b.hi 0x00bb9198
00bb9164	subs x3,x24,x0
00bb9168	b.ls 0x00bb9194
00bb916c	add x2,x23,x0
00bb9170	mov x0,x19
00bb9174	mov x1,x20
00bb9178	mov x4,x21
00bb917c	mov w5,w22
00bb9180	ldp x20,x19,[sp, #0x30]
00bb9184	ldp x22,x21,[sp, #0x20]
00bb9188	ldp x24,x23,[sp, #0x10]
00bb918c	ldp x29,x30,[sp], #0x40
00bb9190	b 0x00bb7c34
00bb9194	mov x0,#-0x48
00bb9198	ldp x20,x19,[sp, #0x30]
00bb919c	ldp x22,x21,[sp, #0x20]
00bb91a0	ldp x24,x23,[sp, #0x10]
00bb91a4	ldp x29,x30,[sp], #0x40
00bb91a8	ret
