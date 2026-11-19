; FUN_00afa190 @ 00afa190
00afa190	str x25,[sp, #-0x50]!
00afa194	stp x20,x19,[sp, #0x30]
00afa198	mov x20,x0
00afa19c	mov w0,#0x1
00afa1a0	stp x24,x23,[sp, #0x10]
00afa1a4	stp x22,x21,[sp, #0x20]
00afa1a8	stp x29,x30,[sp, #0x40]
00afa1ac	add x29,sp,#0x40
00afa1b0	cbz x1,0x00afa2a4
00afa1b4	mov x19,x1
00afa1b8	cmp x20,x1
00afa1bc	b.eq 0x00afa2a4
00afa1c0	cbz x20,0x00afa298
00afa1c4	mov x0,x19
00afa1c8	bl 0x00c325e0
00afa1cc	cmp w0,#0x1
00afa1d0	b.lt 0x00afa2a0
00afa1d4	mov w21,wzr
00afa1d8	mov w22,wzr
00afa1dc	mov x0,x19
00afa1e0	mov w1,w21
00afa1e4	bl 0x00c32610
00afa1e8	cbz x0,0x00afa2a4
00afa1ec	ldr w8,[x0]
00afa1f0	cmp w8,#0x1
00afa1f4	b.eq 0x00afa208
00afa1f8	cbnz w8,0x00afa298
00afa1fc	ldr x23,[x0, #0x8]
00afa200	mov x24,x23
00afa204	b 0x00afa218
00afa208	ldr x8,[x0, #0x8]
00afa20c	ldp x23,x24,[x8]
00afa210	b 0x00afa218
00afa214	add w22,w22,#0x1
00afa218	mov x0,x20
00afa21c	bl 0x00c325e0
00afa220	cmp w22,w0
00afa224	b.ge 0x00afa298
00afa228	mov x0,x20
00afa22c	mov w1,w22
00afa230	bl 0x00c32610
00afa234	cbz x0,0x00afa2a4
00afa238	ldr w8,[x0]
00afa23c	cmp w8,#0x1
00afa240	b.eq 0x00afa254
00afa244	cbnz w8,0x00afa298
00afa248	ldr x25,[x0, #0x8]
00afa24c	mov x0,x25
00afa250	b 0x00afa25c
00afa254	ldr x8,[x0, #0x8]
00afa258	ldp x25,x0,[x8]
00afa25c	mov x1,x24
00afa260	bl 0x00c37560
00afa264	tbnz w0,#0x1f,0x00afa214
00afa268	mov x0,x25
00afa26c	mov x1,x23
00afa270	bl 0x00c37560
00afa274	cmp w0,#0x0
00afa278	b.gt 0x00afa298
00afa27c	mov x0,x19
00afa280	add w21,w21,#0x1
00afa284	bl 0x00c325e0
00afa288	cmp w21,w0
00afa28c	mov w0,#0x1
00afa290	b.lt 0x00afa1dc
00afa294	b 0x00afa2a4
00afa298	mov w0,wzr
00afa29c	b 0x00afa2a4
00afa2a0	mov w0,#0x1
00afa2a4	ldp x29,x30,[sp, #0x40]
00afa2a8	ldp x20,x19,[sp, #0x30]
00afa2ac	ldp x22,x21,[sp, #0x20]
00afa2b0	ldp x24,x23,[sp, #0x10]
00afa2b4	ldr x25,[sp], #0x50
00afa2b8	ret
