; ossl_prop_defn_set @ 00ac5048
00ac5048	sub sp,sp,#0x60
00ac504c	stp x22,x21,[sp, #0x30]
00ac5050	mov x21,x2
00ac5054	adrp x2,0xc7c000
00ac5058	mov x22,x1
00ac505c	add x2,x2,#0x688
00ac5060	mov w1,#0x2
00ac5064	stp x24,x23,[sp, #0x20]
00ac5068	stp x20,x19,[sp, #0x40]
00ac506c	stp x29,x30,[sp, #0x50]
00ac5070	add x29,sp,#0x50
00ac5074	mov x19,x0
00ac5078	bl 0x00c3b520
00ac507c	mov x20,x0
00ac5080	cbz x0,0x00ac5170
00ac5084	cbz x22,0x00ac50c8
00ac5088	mov x0,x19
00ac508c	bl 0x00c3df20
00ac5090	cbz w0,0x00ac50d0
00ac5094	add x1,sp,#0x8
00ac5098	str x22,[sp, #0x8]
00ac509c	cbz x21,0x00ac50d8
00ac50a0	mov x0,x20
00ac50a4	bl 0x00c34de0
00ac50a8	cbz x0,0x00ac50e8
00ac50ac	mov x23,x0
00ac50b0	ldr x0,[x21]
00ac50b4	bl 0x00c3b670
00ac50b8	ldr x8,[x23, #0x8]
00ac50bc	mov w20,#0x1
00ac50c0	str x8,[x21]
00ac50c4	b 0x00ac5168
00ac50c8	mov w20,#0x1
00ac50cc	b 0x00ac5170
00ac50d0	mov w20,wzr
00ac50d4	b 0x00ac5170
00ac50d8	mov x0,x20
00ac50dc	bl 0x00c36010
00ac50e0	mov w20,#0x1
00ac50e4	b 0x00ac5168
00ac50e8	mov x0,x22
00ac50ec	bl 0x00c2ff50
00ac50f0	adrp x1,0x2d0000
00ac50f4	mov x24,x0
00ac50f8	add x0,x0,#0x18
00ac50fc	add x1,x1,#0x2af
00ac5100	orr w2,wzr,#0x7e
00ac5104	bl 0x00c32320
00ac5108	mov x23,x0
00ac510c	cbz x0,0x00ac5150
00ac5110	add x0,x23,#0x10
00ac5114	str x0,[x23]
00ac5118	ldr x8,[x21]
00ac511c	add x2,x24,#0x1
00ac5120	mov x1,x22
00ac5124	str x8,[x23, #0x8]
00ac5128	bl 0x00c2ffd0
00ac512c	mov x0,x20
00ac5130	mov x1,x23
00ac5134	bl 0x00c34dc0
00ac5138	cbz x0,0x00ac5144
00ac513c	mov w20,#0x1
00ac5140	b 0x00ac5168
00ac5144	mov x0,x20
00ac5148	bl 0x00c395f0
00ac514c	cbz w0,0x00ac513c
00ac5150	adrp x1,0x2d0000
00ac5154	add x1,x1,#0x2af
00ac5158	mov w2,#0x8a
00ac515c	mov x0,x23
00ac5160	bl 0x00c32310
00ac5164	mov w20,wzr
00ac5168	mov x0,x19
00ac516c	bl 0x00c3df10
00ac5170	mov w0,w20
00ac5174	ldp x29,x30,[sp, #0x50]
00ac5178	ldp x20,x19,[sp, #0x40]
00ac517c	ldp x22,x21,[sp, #0x30]
00ac5180	ldp x24,x23,[sp, #0x20]
00ac5184	add sp,sp,#0x60
00ac5188	ret
