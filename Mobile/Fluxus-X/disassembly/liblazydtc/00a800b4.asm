; OPENSSL_LH_delete @ 00a800b4
00a800b4	stp x24,x23,[sp, #-0x40]!
00a800b8	stp x22,x21,[sp, #0x10]
00a800bc	stp x20,x19,[sp, #0x20]
00a800c0	stp x29,x30,[sp, #0x30]
00a800c4	ldr x8,[x0, #0x10]
00a800c8	mov x19,x0
00a800cc	str wzr,[x0, #0x40]
00a800d0	mov x0,x1
00a800d4	add x29,sp,#0x30
00a800d8	mov x20,x1
00a800dc	blr x8
00a800e0	ldp w9,w8,[x19, #0x20]
00a800e4	mov x21,x0
00a800e8	udiv x10,x0,x8
00a800ec	msub x8,x10,x8,x0
00a800f0	cmp x8,x9
00a800f4	b.cs 0x00a80104
00a800f8	ldr w8,[x19, #0x1c]
00a800fc	udiv x9,x21,x8
00a80100	msub x8,x9,x8,x21
00a80104	ldr x9,[x19]
00a80108	lsl x8,x8,#0x20
00a8010c	add x22,x9,x8, ASR #0x1d
00a80110	ldr x23,[x22]
00a80114	cbz x23,0x00a80148
00a80118	ldr x24,[x19, #0x8]
00a8011c	ldr x8,[x23, #0x10]
00a80120	cmp x8,x21
00a80124	b.ne 0x00a80138
00a80128	ldr x0,[x23]
00a8012c	mov x1,x20
00a80130	blr x24
00a80134	cbz w0,0x00a80164
00a80138	ldr x8,[x23, #0x8]!
00a8013c	mov x22,x23
00a80140	mov x23,x8
00a80144	cbnz x8,0x00a8011c
00a80148	mov x20,xzr
00a8014c	mov x0,x20
00a80150	ldp x29,x30,[sp, #0x30]
00a80154	ldp x20,x19,[sp, #0x20]
00a80158	ldp x22,x21,[sp, #0x10]
00a8015c	ldp x24,x23,[sp], #0x40
00a80160	ret
00a80164	ldr x0,[x22]
00a80168	cbz x0,0x00a80148
00a8016c	ldr x8,[x0, #0x8]
00a80170	adrp x1,0x2b0000
00a80174	add x1,x1,#0xdf
00a80178	mov w2,#0x98
00a8017c	str x8,[x22]
00a80180	ldr x20,[x0]
00a80184	bl 0x00c32310
00a80188	ldr x9,[x19, #0x38]
00a8018c	ldr w8,[x19, #0x18]
00a80190	sub x9,x9,#0x1
00a80194	cmp w8,#0x11
00a80198	str x9,[x19, #0x38]
00a8019c	b.cc 0x00a8014c
00a801a0	ldr x10,[x19, #0x30]
00a801a4	lsl x9,x9,#0x8
00a801a8	udiv x9,x9,x8
00a801ac	cmp x10,x9
00a801b0	b.cc 0x00a8014c
00a801b4	ldp w11,w10,[x19, #0x20]
00a801b8	ldr x12,[x19]
00a801bc	sub w9,w11,#0x1
00a801c0	add w13,w9,w10
00a801c4	lsl x13,x13,#0x3
00a801c8	ldr x21,[x12, x13#0x0]
00a801cc	str xzr,[x12, x13#0x0]
00a801d0	cbnz w11,0x00a80220
00a801d4	ldr x0,[x19]
00a801d8	adrp x2,0x2b0000
00a801dc	lsl w1,w10,#0x3
00a801e0	add x2,x2,#0xdf
00a801e4	mov w3,#0x109
00a801e8	bl 0x00c356f0
00a801ec	cbz x0,0x00a801f8
00a801f0	str x0,[x19]
00a801f4	b 0x00a80204
00a801f8	ldr w8,[x19, #0x40]
00a801fc	add w8,w8,#0x1
00a80200	str w8,[x19, #0x40]
00a80204	ldp w8,w9,[x19, #0x18]
00a80208	ldr w10,[x19, #0x24]
00a8020c	lsr w9,w9,#0x1
00a80210	lsr w10,w10,#0x1
00a80214	str w9,[x19, #0x1c]
00a80218	sub w9,w10,#0x1
00a8021c	str w10,[x19, #0x24]
00a80220	ldr x10,[x19]
00a80224	sub w8,w8,#0x1
00a80228	str w9,[x19, #0x20]
00a8022c	str w8,[x19, #0x18]
00a80230	ldr x8,[x10, w9, SXTW #0x3]
00a80234	cbz x8,0x00a8024c
00a80238	mov x9,x8
00a8023c	ldr x8,[x8, #0x8]
00a80240	cbnz x8,0x00a80238
00a80244	str x21,[x9, #0x8]
00a80248	b 0x00a8014c
00a8024c	sxtw x8,w9
00a80250	str x21,[x10, x8, LSL #0x3]
00a80254	b 0x00a8014c
