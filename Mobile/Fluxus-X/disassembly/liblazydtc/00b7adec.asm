; mbedtls_nist_kw_self_test @ 00b7adec
00b7adec	sub sp,sp,#0x110
00b7adf0	stp x28,x27,[sp, #0xb0]
00b7adf4	stp x26,x25,[sp, #0xc0]
00b7adf8	stp x24,x23,[sp, #0xd0]
00b7adfc	stp x22,x21,[sp, #0xe0]
00b7ae00	stp x20,x19,[sp, #0xf0]
00b7ae04	stp x29,x30,[sp, #0x100]
00b7ae08	add x29,sp,#0x100
00b7ae0c	mrs x8,tpidr_el0
00b7ae10	str x8,[sp]
00b7ae14	ldr x8,[x8, #0x28]
00b7ae18	mov w19,w0
00b7ae1c	add x0,sp,#0x40
00b7ae20	orr w2,wzr,#0x60
00b7ae24	mov w1,wzr
00b7ae28	stur x8,[x29, #-0x60]
00b7ae2c	bl 0x00c301c0
00b7ae30	adrp x21,0x77f000
00b7ae34	adrp x22,0x77f000
00b7ae38	adrp x23,0x780000
00b7ae3c	adrp x24,0x780000
00b7ae40	mov x25,xzr
00b7ae44	add x21,x21,#0xf90
00b7ae48	add x22,x22,#0xff0
00b7ae4c	add x23,x23,#0x98
00b7ae50	add x24,x24,#0x80
00b7ae54	adrp x8,0x77f000
00b7ae58	add x8,x8,#0xf84
00b7ae5c	ldr w8,[x8, x25, LSL #0x2]
00b7ae60	lsl w26,w8,#0x3
00b7ae64	cbz w19,0x00b7ae78
00b7ae68	adrp x0,0x2d0000
00b7ae6c	add x0,x0,#0x99e
00b7ae70	mov w1,w26
00b7ae74	bl 0x00c41af0
00b7ae78	mov w0,#0x2
00b7ae7c	mov w2,#0x1
00b7ae80	mov w1,w26
00b7ae84	bl 0x00c42160
00b7ae88	mov x20,x0
00b7ae8c	cbz x0,0x00b7b214
00b7ae90	ldr w8,[x20, #0x8]
00b7ae94	and w8,w8,#0x1f
00b7ae98	cmp w8,#0x10
00b7ae9c	b.ne 0x00b7b1e8
00b7aea0	add x0,sp,#0x40
00b7aea4	bl 0x00c30290
00b7aea8	add x0,sp,#0x40
00b7aeac	mov x1,x20
00b7aeb0	bl 0x00c30280
00b7aeb4	mov w20,w0
00b7aeb8	cbnz w0,0x00b7b218
00b7aebc	add x0,sp,#0x40
00b7aec0	mov w3,#0x1
00b7aec4	mov x1,x21
00b7aec8	mov w2,w26
00b7aecc	bl 0x00c302a0
00b7aed0	mov w20,w0
00b7aed4	cbnz w0,0x00b7b218
00b7aed8	adrp x8,0x780000
00b7aedc	add x8,x8,#0x68
00b7aee0	ldr x27,[x8, x25, LSL #0x3]
00b7aee4	add x0,sp,#0x40
00b7aee8	add x4,sp,#0x10
00b7aeec	add x5,sp,#0x8
00b7aef0	orr w6,wzr,#0x30
00b7aef4	mov w1,wzr
00b7aef8	mov x2,x22
00b7aefc	mov x3,x27
00b7af00	bl 0x00c42210
00b7af04	cbnz w0,0x00b7b1d0
00b7af08	ldr x28,[x24, x25, LSL #0x3]
00b7af0c	ldr x8,[sp, #0x8]
00b7af10	cmp x28,x8
00b7af14	b.ne 0x00b7b1d0
00b7af18	add x0,sp,#0x10
00b7af1c	mov x1,x23
00b7af20	mov x2,x28
00b7af24	bl 0x00c300b0
00b7af28	cbnz w0,0x00b7b1d0
00b7af2c	mov w0,#0x2
00b7af30	mov w2,#0x1
00b7af34	mov w1,w26
00b7af38	bl 0x00c42160
00b7af3c	mov x20,x0
00b7af40	cbz x0,0x00b7b1e8
00b7af44	ldr w8,[x20, #0x8]
00b7af48	and w8,w8,#0x1f
00b7af4c	cmp w8,#0x10
00b7af50	b.ne 0x00b7b1e8
00b7af54	add x0,sp,#0x40
00b7af58	bl 0x00c30290
00b7af5c	add x0,sp,#0x40
00b7af60	mov x1,x20
00b7af64	bl 0x00c30280
00b7af68	mov w20,w0
00b7af6c	cbnz w0,0x00b7b218
00b7af70	add x0,sp,#0x40
00b7af74	mov x1,x21
00b7af78	mov w2,w26
00b7af7c	mov w3,wzr
00b7af80	bl 0x00c302a0
00b7af84	mov w20,w0
00b7af88	cbnz w0,0x00b7b218
00b7af8c	add x0,sp,#0x40
00b7af90	add x2,sp,#0x10
00b7af94	add x4,sp,#0x10
00b7af98	add x5,sp,#0x8
00b7af9c	orr w6,wzr,#0x30
00b7afa0	mov w1,wzr
00b7afa4	mov x3,x28
00b7afa8	bl 0x00c42200
00b7afac	cbnz w0,0x00b7b1f4
00b7afb0	ldr x8,[sp, #0x8]
00b7afb4	cmp x8,x27
00b7afb8	b.ne 0x00b7b1f4
00b7afbc	add x0,sp,#0x10
00b7afc0	mov x1,x22
00b7afc4	mov x2,x27
00b7afc8	bl 0x00c300b0
00b7afcc	cbnz w0,0x00b7b1f4
00b7afd0	cbz w19,0x00b7afe0
00b7afd4	adrp x0,0x77c000
00b7afd8	add x0,x0,#0x88c
00b7afdc	bl 0x00c30760
00b7afe0	add x25,x25,#0x1
00b7afe4	add x21,x21,#0x20
00b7afe8	add x22,x22,#0x28
00b7afec	cmp x25,#0x3
00b7aff0	add x23,x23,#0x30
00b7aff4	b.cc 0x00b7ae54
00b7aff8	adrp x21,0x780000
00b7affc	adrp x22,0x780000
00b7b000	adrp x23,0x780000
00b7b004	mov x25,xzr
00b7b008	add x21,x21,#0x128
00b7b00c	add x22,x22,#0x188
00b7b010	add x23,x23,#0x218
00b7b014	orr w24,wzr,#0x30
00b7b018	adrp x8,0x77f000
00b7b01c	add x8,x8,#0xf84
00b7b020	ldr w8,[x8, x25, LSL #0x2]
00b7b024	str x24,[sp, #0x8]
00b7b028	lsl w26,w8,#0x3
00b7b02c	cbz w19,0x00b7b040
00b7b030	adrp x0,0x2ca000
00b7b034	add x0,x0,#0x8f4
00b7b038	mov w1,w26
00b7b03c	bl 0x00c41af0
00b7b040	mov w0,#0x2
00b7b044	mov w2,#0x1
00b7b048	mov w1,w26
00b7b04c	bl 0x00c42160
00b7b050	mov x20,x0
00b7b054	cbz x0,0x00b7b280
00b7b058	ldr w8,[x20, #0x8]
00b7b05c	and w8,w8,#0x1f
00b7b060	cmp w8,#0x10
00b7b064	b.ne 0x00b7b28c
00b7b068	add x0,sp,#0x40
00b7b06c	bl 0x00c30290
00b7b070	add x0,sp,#0x40
00b7b074	mov x1,x20
00b7b078	bl 0x00c30280
00b7b07c	mov w20,w0
00b7b080	cbnz w0,0x00b7b290
00b7b084	add x0,sp,#0x40
00b7b088	mov w3,#0x1
00b7b08c	mov x1,x21
00b7b090	mov w2,w26
00b7b094	bl 0x00c302a0
00b7b098	mov w20,w0
00b7b09c	cbnz w0,0x00b7b290
00b7b0a0	adrp x8,0x780000
00b7b0a4	add x8,x8,#0x1e8
00b7b0a8	ldr x27,[x8, x25, LSL #0x3]
00b7b0ac	add x0,sp,#0x40
00b7b0b0	mov w1,#0x1
00b7b0b4	add x4,sp,#0x10
00b7b0b8	add x5,sp,#0x8
00b7b0bc	orr w6,wzr,#0x30
00b7b0c0	mov x2,x22
00b7b0c4	mov x3,x27
00b7b0c8	bl 0x00c42210
00b7b0cc	cbnz w0,0x00b7b1d0
00b7b0d0	adrp x8,0x780000
00b7b0d4	add x8,x8,#0x200
00b7b0d8	ldr x28,[x8, x25, LSL #0x3]
00b7b0dc	ldr x8,[sp, #0x8]
00b7b0e0	cmp x28,x8
00b7b0e4	b.ne 0x00b7b1d0
00b7b0e8	add x0,sp,#0x10
00b7b0ec	mov x1,x23
00b7b0f0	mov x2,x28
00b7b0f4	bl 0x00c300b0
00b7b0f8	cbnz w0,0x00b7b1d0
00b7b0fc	mov w0,#0x2
00b7b100	mov w2,#0x1
00b7b104	mov w1,w26
00b7b108	bl 0x00c42160
00b7b10c	mov x20,x0
00b7b110	cbz x0,0x00b7b280
00b7b114	ldr w8,[x20, #0x8]
00b7b118	and w8,w8,#0x1f
00b7b11c	cmp w8,#0x10
00b7b120	b.ne 0x00b7b280
00b7b124	add x0,sp,#0x40
00b7b128	bl 0x00c30290
00b7b12c	add x0,sp,#0x40
00b7b130	mov x1,x20
00b7b134	bl 0x00c30280
00b7b138	mov w20,w0
00b7b13c	cbnz w0,0x00b7b290
00b7b140	add x0,sp,#0x40
00b7b144	mov x1,x21
00b7b148	mov w2,w26
00b7b14c	mov w3,wzr
00b7b150	bl 0x00c302a0
00b7b154	mov w20,w0
00b7b158	cbnz w0,0x00b7b290
00b7b15c	add x0,sp,#0x40
00b7b160	mov w1,#0x1
00b7b164	add x2,sp,#0x10
00b7b168	add x4,sp,#0x10
00b7b16c	add x5,sp,#0x8
00b7b170	orr w6,wzr,#0x30
00b7b174	mov x3,x28
00b7b178	bl 0x00c42200
00b7b17c	cbnz w0,0x00b7b1d0
00b7b180	ldr x8,[sp, #0x8]
00b7b184	cmp x8,x27
00b7b188	b.ne 0x00b7b1d0
00b7b18c	add x0,sp,#0x10
00b7b190	mov x1,x22
00b7b194	mov x2,x27
00b7b198	bl 0x00c300b0
00b7b19c	cbnz w0,0x00b7b1d0
00b7b1a0	cbz w19,0x00b7b1b0
00b7b1a4	adrp x0,0x77c000
00b7b1a8	add x0,x0,#0x88c
00b7b1ac	bl 0x00c30760
00b7b1b0	add x25,x25,#0x1
00b7b1b4	mov w20,wzr
00b7b1b8	add x21,x21,#0x20
00b7b1bc	add x22,x22,#0x1f
00b7b1c0	cmp x25,#0x3
00b7b1c4	add x23,x23,#0x30
00b7b1c8	b.cc 0x00b7b018
00b7b1cc	b 0x00b7b228
00b7b1d0	cbz w19,0x00b7b20c
00b7b1d4	adrp x0,0x2a1000
00b7b1d8	add x0,x0,#0x1d7
00b7b1dc	bl 0x00c41af0
00b7b1e0	mov w20,#0x1
00b7b1e4	b 0x00b7b228
00b7b1e8	mov w20,#0xffff9f00
00b7b1ec	cbnz w19,0x00b7b21c
00b7b1f0	b 0x00b7b228
00b7b1f4	cbz w19,0x00b7b20c
00b7b1f8	adrp x0,0x77c000
00b7b1fc	add x0,x0,#0x854
00b7b200	bl 0x00c30760
00b7b204	mov w20,#0x1
00b7b208	b 0x00b7b228
00b7b20c	mov w20,#0x1
00b7b210	b 0x00b7b228
00b7b214	mov w20,#0xffff9f00
00b7b218	cbz w19,0x00b7b228
00b7b21c	adrp x0,0x2a3000
00b7b220	add x0,x0,#0x365
00b7b224	bl 0x00c41af0
00b7b228	add x0,sp,#0x40
00b7b22c	bl 0x00c30290
00b7b230	add x0,sp,#0x40
00b7b234	orr w1,wzr,#0x60
00b7b238	bl 0x00c42220
00b7b23c	cbz w19,0x00b7b248
00b7b240	mov w0,#0xa
00b7b244	bl 0x00c42240
00b7b248	ldr x8,[sp]
00b7b24c	ldr x8,[x8, #0x28]
00b7b250	ldur x9,[x29, #-0x60]
00b7b254	cmp x8,x9
00b7b258	b.ne 0x00b7b2a0
00b7b25c	mov w0,w20
00b7b260	ldp x29,x30,[sp, #0x100]
00b7b264	ldp x20,x19,[sp, #0xf0]
00b7b268	ldp x22,x21,[sp, #0xe0]
00b7b26c	ldp x24,x23,[sp, #0xd0]
00b7b270	ldp x26,x25,[sp, #0xc0]
00b7b274	ldp x28,x27,[sp, #0xb0]
00b7b278	add sp,sp,#0x110
00b7b27c	ret
00b7b280	mov w20,#0xffff9f00
00b7b284	cbnz w19,0x00b7b294
00b7b288	b 0x00b7b228
00b7b28c	mov w20,#0xffff9f00
00b7b290	cbz w19,0x00b7b228
00b7b294	adrp x0,0x2ab000
00b7b298	add x0,x0,#0x134
00b7b29c	b 0x00b7b224
00b7b2a0	bl 0x00c2fec0
