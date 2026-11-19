; FUN_00aff100 @ 00aff100
00aff100	stp x26,x25,[sp, #-0x50]!
00aff104	stp x24,x23,[sp, #0x10]
00aff108	stp x22,x21,[sp, #0x20]
00aff10c	stp x20,x19,[sp, #0x30]
00aff110	stp x29,x30,[sp, #0x40]
00aff114	ldr w21,[x0]
00aff118	mov x19,x0
00aff11c	mov x20,x1
00aff120	add x29,sp,#0x40
00aff124	cbnz w21,0x00aff13c
00aff128	ldr x8,[x19, #0x8]
00aff12c	ldr x0,[x8]
00aff130	bl 0x00c37750
00aff134	cmp w0,#0x4b8
00aff138	cset w21,eq
00aff13c	ldr x0,[x20]
00aff140	bl 0x00c325e0
00aff144	cmp w0,#0x1
00aff148	b.lt 0x00aff228
00aff14c	mov w25,wzr
00aff150	mov w22,wzr
00aff154	ldr x0,[x20]
00aff158	mov w1,w22
00aff15c	bl 0x00c32610
00aff160	ldr x8,[x0]
00aff164	ldr w9,[x8]
00aff168	cmp w21,w9
00aff16c	b.ne 0x00aff204
00aff170	mov x23,x0
00aff174	cbz w21,0x00aff1e4
00aff178	ldp x0,x8,[x23, #0x8]
00aff17c	cmp x8,#0x0
00aff180	cset w26,eq
00aff184	cbz x0,0x00aff1b0
00aff188	mov x1,xzr
00aff18c	bl 0x00c375e0
00aff190	mov x24,x0
00aff194	cbz x0,0x00aff1a4
00aff198	mov x0,x24
00aff19c	bl 0x00c369b0
00aff1a0	cbnz w0,0x00aff1a8
00aff1a4	mov w26,wzr
00aff1a8	mov x0,x24
00aff1ac	bl 0x00c36290
00aff1b0	cbz w26,0x00aff2ec
00aff1b4	cmp w25,#0x2
00aff1b8	b.eq 0x00aff204
00aff1bc	cbnz w25,0x00aff1c4
00aff1c0	mov w25,#0x1
00aff1c4	ldr x2,[x23]
00aff1c8	mov w0,w21
00aff1cc	mov x1,x19
00aff1d0	bl 0x00aff7f0
00aff1d4	cbz w0,0x00aff200
00aff1d8	cmp w0,#0x2f
00aff1dc	b.eq 0x00aff204
00aff1e0	b 0x00aff2f0
00aff1e4	ldr x9,[x19, #0x8]
00aff1e8	ldr x8,[x8, #0x8]
00aff1ec	ldr x0,[x9]
00aff1f0	ldr x1,[x8]
00aff1f4	bl 0x00c37ab0
00aff1f8	cbnz w0,0x00aff204
00aff1fc	b 0x00aff178
00aff200	mov w25,#0x2
00aff204	ldr x0,[x20]
00aff208	add w22,w22,#0x1
00aff20c	bl 0x00c325e0
00aff210	cmp w22,w0
00aff214	b.lt 0x00aff154
00aff218	cmp w25,#0x1
00aff21c	b.ne 0x00aff228
00aff220	mov w0,#0x2f
00aff224	b 0x00aff2f0
00aff228	ldr x0,[x20, #0x8]
00aff22c	bl 0x00c325e0
00aff230	cmp w0,#0x1
00aff234	b.lt 0x00aff2e4
00aff238	mov w22,wzr
00aff23c	ldr x0,[x20, #0x8]
00aff240	mov w1,w22
00aff244	bl 0x00c32610
00aff248	ldr x8,[x0]
00aff24c	ldr w9,[x8]
00aff250	cmp w21,w9
00aff254	b.ne 0x00aff2d0
00aff258	mov x23,x0
00aff25c	cbz w21,0x00aff2b8
00aff260	ldp x0,x8,[x23, #0x8]
00aff264	cmp x8,#0x0
00aff268	cset w25,eq
00aff26c	cbz x0,0x00aff298
00aff270	mov x1,xzr
00aff274	bl 0x00c375e0
00aff278	mov x24,x0
00aff27c	cbz x0,0x00aff28c
00aff280	mov x0,x24
00aff284	bl 0x00c369b0
00aff288	cbnz w0,0x00aff290
00aff28c	mov w25,wzr
00aff290	mov x0,x24
00aff294	bl 0x00c36290
00aff298	cbz w25,0x00aff2ec
00aff29c	ldr x2,[x23]
00aff2a0	mov w0,w21
00aff2a4	mov x1,x19
00aff2a8	bl 0x00aff7f0
00aff2ac	cmp w0,#0x2f
00aff2b0	b.eq 0x00aff2d0
00aff2b4	b 0x00aff308
00aff2b8	ldr x9,[x19, #0x8]
00aff2bc	ldr x8,[x8, #0x8]
00aff2c0	ldr x0,[x9]
00aff2c4	ldr x1,[x8]
00aff2c8	bl 0x00c37ab0
00aff2cc	cbz w0,0x00aff260
00aff2d0	ldr x0,[x20, #0x8]
00aff2d4	add w22,w22,#0x1
00aff2d8	bl 0x00c325e0
00aff2dc	cmp w22,w0
00aff2e0	b.lt 0x00aff23c
00aff2e4	mov w0,wzr
00aff2e8	b 0x00aff2f0
00aff2ec	mov w0,#0x31
00aff2f0	ldp x29,x30,[sp, #0x40]
00aff2f4	ldp x20,x19,[sp, #0x30]
00aff2f8	ldp x22,x21,[sp, #0x20]
00aff2fc	ldp x24,x23,[sp, #0x10]
00aff300	ldp x26,x25,[sp], #0x50
00aff304	ret
00aff308	cbnz w0,0x00aff2f0
00aff30c	orr w0,wzr,#0x30
00aff310	b 0x00aff2f0
