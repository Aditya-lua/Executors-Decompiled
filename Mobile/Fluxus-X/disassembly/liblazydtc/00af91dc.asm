; X509v3_asid_add_inherit @ 00af91dc
00af91dc	str x19,[sp, #-0x20]!
00af91e0	stp x29,x30,[sp, #0x10]
00af91e4	add x29,sp,#0x10
00af91e8	cbz x0,0x00af9214
00af91ec	mov x19,x0
00af91f0	cmp w1,#0x1
00af91f4	b.eq 0x00af9220
00af91f8	mov w0,wzr
00af91fc	cbnz w1,0x00af9214
00af9200	ldr x8,[x19]
00af9204	cbz x8,0x00af922c
00af9208	ldr w8,[x8]
00af920c	cmp w8,#0x0
00af9210	cset w0,eq
00af9214	ldp x29,x30,[sp, #0x10]
00af9218	ldr x19,[sp], #0x20
00af921c	ret
00af9220	add x19,x19,#0x8
00af9224	ldr x8,[x19]
00af9228	cbnz x8,0x00af9208
00af922c	adrp x0,0xc7e000
00af9230	add x0,x0,#0xbc0
00af9234	bl 0x00c372e0
00af9238	str x0,[x19]
00af923c	cbz x0,0x00af9214
00af9240	bl 0x00c38160
00af9244	ldr x9,[x19]
00af9248	mov x8,x0
00af924c	str x0,[x9, #0x8]
00af9250	ldr x0,[x19]
00af9254	cbz x8,0x00af9264
00af9258	str wzr,[x0]
00af925c	mov w0,#0x1
00af9260	b 0x00af9214
00af9264	adrp x1,0xc7e000
00af9268	add x1,x1,#0xbc0
00af926c	bl 0x00c36160
00af9270	mov w0,wzr
00af9274	str xzr,[x19]
00af9278	b 0x00af9214
