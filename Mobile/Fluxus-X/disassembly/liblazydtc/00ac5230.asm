; ossl_sa_free @ 00ac5230
00ac5230	cbz x0,0x00ac531c
00ac5234	sub sp,sp,#0x100
00ac5238	stp x29,x30,[sp, #0xf0]
00ac523c	add x29,sp,#0xf0
00ac5240	stp x22,x21,[sp, #0xd0]
00ac5244	stp x20,x19,[sp, #0xe0]
00ac5248	stur wzr,[x29, #-0x70]
00ac524c	ldr x10,[x0, #0x18]
00ac5250	adrp x20,0x2dc000
00ac5254	mov x19,x0
00ac5258	mov w8,wzr
00ac525c	mov w9,wzr
00ac5260	mov x21,sp
00ac5264	sub x22,x29,#0x70
00ac5268	add x20,x20,#0x89f
00ac526c	str x23,[sp, #0xc0]
00ac5270	str x10,[sp]
00ac5274	b 0x00ac5280
00ac5278	sub x9,x23,#0x1
00ac527c	ldr w8,[x22, x9, LSL #0x2]
00ac5280	ldr x0,[x21, w9, SXTW #0x3]
00ac5284	sxtw x23,w9
00ac5288	sxtw x8,w8
00ac528c	cmp w8,#0x10
00ac5290	b.lt 0x00ac52bc
00ac5294	cbz x0,0x00ac52a4
00ac5298	mov w2,#0x66
00ac529c	mov x1,x20
00ac52a0	bl 0x00c32310
00ac52a4	cmp w23,#0x1
00ac52a8	b.ge 0x00ac5278
00ac52ac	b 0x00ac52f4
00ac52b0	add x8,x8,#0x1
00ac52b4	cmp w8,#0x10
00ac52b8	b.ge 0x00ac5294
00ac52bc	add w9,w8,#0x1
00ac52c0	str w9,[x22, x23, LSL #0x2]
00ac52c4	cbz x0,0x00ac52b0
00ac52c8	ldr x10,[x0, x8, LSL #0x3]
00ac52cc	cbz x10,0x00ac52b0
00ac52d0	ldr w9,[x19]
00ac52d4	sub w9,w9,#0x1
00ac52d8	cmp w23,w9
00ac52dc	b.ge 0x00ac52b0
00ac52e0	add x9,x23,#0x1
00ac52e4	mov w8,wzr
00ac52e8	str wzr,[x22, x9, LSL #0x2]
00ac52ec	str x10,[x21, x9, LSL #0x3]
00ac52f0	b 0x00ac5280
00ac52f4	mov x0,x19
00ac52f8	ldp x29,x30,[sp, #0xf0]
00ac52fc	ldp x20,x19,[sp, #0xe0]
00ac5300	ldp x22,x21,[sp, #0xd0]
00ac5304	ldr x23,[sp, #0xc0]
00ac5308	adrp x1,0x2dc000
00ac530c	add x1,x1,#0x89f
00ac5310	mov w2,#0x72
00ac5314	add sp,sp,#0x100
00ac5318	b 0x00c32310
00ac531c	ret
