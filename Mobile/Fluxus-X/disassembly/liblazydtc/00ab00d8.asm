; OCSP_check_validity @ 00ab00d8
00ab00d8	sub sp,sp,#0x50
00ab00dc	stp x20,x19,[sp, #0x30]
00ab00e0	mov x19,x0
00ab00e4	add x0,sp,#0x18
00ab00e8	str x23,[sp, #0x10]
00ab00ec	stp x22,x21,[sp, #0x20]
00ab00f0	stp x29,x30,[sp, #0x40]
00ab00f4	add x29,sp,#0x40
00ab00f8	mov x23,x3
00ab00fc	mov x21,x2
00ab0100	mov x20,x1
00ab0104	bl 0x00c30970
00ab0108	mov x0,x19
00ab010c	bl 0x00c374c0
00ab0110	cbz w0,0x00ab016c
00ab0114	ldr x8,[sp, #0x18]
00ab0118	add x1,sp,#0x8
00ab011c	mov x0,x19
00ab0120	add x8,x8,x21
00ab0124	str x8,[sp, #0x8]
00ab0128	bl 0x00c3ef50
00ab012c	cmp w0,#0x1
00ab0130	b.lt 0x00ab0194
00ab0134	bl 0x00c342a0
00ab0138	adrp x0,0x2d0000
00ab013c	adrp x2,0x2ae000
00ab0140	add x0,x0,#0x1c9
00ab0144	add x2,x2,#0x4f8
00ab0148	mov w1,#0x144
00ab014c	bl 0x00c342b0
00ab0150	mov w0,#0x27
00ab0154	orr w1,wzr,#0x7e
00ab0158	mov x2,xzr
00ab015c	bl 0x00c342c0
00ab0160	mov w22,wzr
00ab0164	tbz x23,#0x3f,0x00ab019c
00ab0168	b 0x00ab01e8
00ab016c	bl 0x00c342a0
00ab0170	adrp x0,0x2d0000
00ab0174	adrp x2,0x2ae000
00ab0178	add x0,x0,#0x1c9
00ab017c	add x2,x2,#0x4f8
00ab0180	mov w1,#0x13f
00ab0184	bl 0x00c342b0
00ab0188	mov w0,#0x27
00ab018c	mov w1,#0x7b
00ab0190	b 0x00ab01dc
00ab0194	mov w22,#0x1
00ab0198	tbnz x23,#0x3f,0x00ab01e8
00ab019c	ldr x8,[sp, #0x18]
00ab01a0	add x1,sp,#0x8
00ab01a4	mov x0,x19
00ab01a8	sub x8,x8,x23
00ab01ac	str x8,[sp, #0x8]
00ab01b0	bl 0x00c3ef50
00ab01b4	tbz w0,#0x1f,0x00ab01e8
00ab01b8	bl 0x00c342a0
00ab01bc	adrp x0,0x2d0000
00ab01c0	adrp x2,0x2ae000
00ab01c4	add x0,x0,#0x1c9
00ab01c8	add x2,x2,#0x4f8
00ab01cc	mov w1,#0x14f
00ab01d0	bl 0x00c342b0
00ab01d4	mov w0,#0x27
00ab01d8	orr w1,wzr,#0x7f
00ab01dc	mov x2,xzr
00ab01e0	bl 0x00c342c0
00ab01e4	mov w22,wzr
00ab01e8	cbz x20,0x00ab02ac
00ab01ec	mov x0,x20
00ab01f0	bl 0x00c374c0
00ab01f4	cbz w0,0x00ab023c
00ab01f8	ldr x8,[sp, #0x18]
00ab01fc	add x1,sp,#0x8
00ab0200	mov x0,x20
00ab0204	sub x8,x8,x21
00ab0208	str x8,[sp, #0x8]
00ab020c	bl 0x00c3ef50
00ab0210	tbz w0,#0x1f,0x00ab026c
00ab0214	bl 0x00c342a0
00ab0218	adrp x0,0x2d0000
00ab021c	adrp x2,0x2ae000
00ab0220	add x0,x0,#0x1c9
00ab0224	add x2,x2,#0x4f8
00ab0228	mov w1,#0x15f
00ab022c	bl 0x00c342b0
00ab0230	mov w0,#0x27
00ab0234	mov w1,#0x7d
00ab0238	b 0x00ab0260
00ab023c	bl 0x00c342a0
00ab0240	adrp x0,0x2d0000
00ab0244	adrp x2,0x2ae000
00ab0248	add x0,x0,#0x1c9
00ab024c	add x2,x2,#0x4f8
00ab0250	mov w1,#0x15a
00ab0254	bl 0x00c342b0
00ab0258	mov w0,#0x27
00ab025c	mov w1,#0x7a
00ab0260	mov x2,xzr
00ab0264	bl 0x00c342c0
00ab0268	mov w22,wzr
00ab026c	mov x0,x20
00ab0270	mov x1,x19
00ab0274	bl 0x00c37a20
00ab0278	tbz w0,#0x1f,0x00ab02ac
00ab027c	bl 0x00c342a0
00ab0280	adrp x0,0x2d0000
00ab0284	adrp x2,0x2ae000
00ab0288	add x0,x0,#0x1c9
00ab028c	add x2,x2,#0x4f8
00ab0290	mov w1,#0x166
00ab0294	bl 0x00c342b0
00ab0298	mov w0,#0x27
00ab029c	orr w1,wzr,#0x7c
00ab02a0	mov x2,xzr
00ab02a4	bl 0x00c342c0
00ab02a8	mov w22,wzr
00ab02ac	mov w0,w22
00ab02b0	ldp x29,x30,[sp, #0x40]
00ab02b4	ldp x20,x19,[sp, #0x30]
00ab02b8	ldp x22,x21,[sp, #0x20]
00ab02bc	ldr x23,[sp, #0x10]
00ab02c0	add sp,sp,#0x50
00ab02c4	ret
