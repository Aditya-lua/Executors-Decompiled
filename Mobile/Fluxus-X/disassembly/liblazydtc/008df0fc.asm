; FUN_008df0fc @ 008df0fc
008df0fc	stp x29,x30,[sp, #-0x60]!
008df100	stp x28,x27,[sp, #0x10]
008df104	stp x26,x25,[sp, #0x20]
008df108	stp x24,x23,[sp, #0x30]
008df10c	stp x22,x21,[sp, #0x40]
008df110	stp x20,x19,[sp, #0x50]
008df114	mov x29,sp
008df118	sub sp,sp,#0x2, LSL #12
008df11c	sub sp,sp,#0xc80
008df120	mrs x8,tpidr_el0
008df124	mov x21,x0
008df128	add x0,sp,#0x2, LSL #12
008df12c	str x8,[sp]
008df130	add x0,x0,#0x468
008df134	mov w1,wzr
008df138	ldr x8,[x8, #0x28]
008df13c	mov w2,#0x804
008df140	stur x8,[x29, #-0x10]
008df144	bl 0x00c301c0
008df148	add x8,sp,#0x50
008df14c	mov w24,wzr
008df150	add x22,x8,#0x808
008df154	add x28,x8,#0xe08
008df158	ldr x8,[x21, #0x860]
008df15c	ldr x9,[x21, #0x858]
008df160	subs x20,x8,x9
008df164	b.eq 0x008df18c
008df168	tbnz x20,#0x3f,0x008df470
008df16c	mov x0,x20
008df170	bl 0x00c2fed0
008df174	mov w1,wzr
008df178	mov x2,x20
008df17c	mov x27,x0
008df180	add x19,x0,x20
008df184	bl 0x00c301c0
008df188	b 0x008df194
008df18c	mov x19,xzr
008df190	mov x27,xzr
008df194	subs x8,x19,x27
008df198	str x8,[sp, #0x8]
008df19c	b.eq 0x008df1e0
008df1a0	ldr x8,[sp, #0x8]
008df1a4	mov x19,xzr
008df1a8	asr x8,x8,#0x4
008df1ac	cmp x8,#0x1
008df1b0	csinc x23,x8,xzr,hi
008df1b4	ldr x8,[x21, #0x858]
008df1b8	add x8,x8,x19
008df1bc	ldp x1,x2,[x8]
008df1c0	add x0,sp,#0x2, LSL #12
008df1c4	add x0,x0,#0x468
008df1c8	bl 0x008dd9cc
008df1cc	add x8,x27,x19
008df1d0	subs x23,x23,#0x1
008df1d4	add x19,x19,#0x10
008df1d8	stp x0,x1,[x8]
008df1dc	b.ne 0x008df1b4
008df1e0	add x0,sp,#0x1, LSL #12
008df1e4	mov w1,wzr
008df1e8	mov w2,#0x804
008df1ec	add x0,x0,#0xc60
008df1f0	mov w20,w24
008df1f4	bl 0x00c301c0
008df1f8	mov w23,wzr
008df1fc	mov x26,xzr
008df200	mov x19,x27
008df204	mov x24,xzr
008df208	mov x25,x19
008df20c	stp xzr,xzr,[sp, #0x50]
008df210	b 0x008df224
008df214	add x24,x24,#0x1
008df218	add x25,x25,#0x10
008df21c	cmp x24,#0x80
008df220	b.eq 0x008df244
008df224	mov x0,x25
008df228	mov w1,w23
008df22c	bl 0x008dd8dc
008df230	tbz w0,#0x0,0x008df214
008df234	add x0,sp,#0x50
008df238	mov w1,w24
008df23c	bl 0x008dd8f4
008df240	b 0x008df214
008df244	ldp x1,x2,[sp, #0x50]
008df248	add x0,sp,#0x1, LSL #12
008df24c	add x0,x0,#0xc60
008df250	bl 0x008dd970
008df254	add x26,x26,#0x1
008df258	add x19,x19,#0x800
008df25c	cmp x26,#0x80
008df260	b.ne 0x008df204
008df264	add w23,w23,#0x1
008df268	cmp w23,#0x60
008df26c	b.ne 0x008df1fc
008df270	add x0,sp,#0x1, LSL #12
008df274	add x8,sp,#0x38
008df278	add x0,x0,#0xc60
008df27c	bl 0x008dda14
008df280	add x0,sp,#0x1, LSL #12
008df284	add x1,sp,#0x2, LSL #12
008df288	mov w2,#0x808
008df28c	add x0,x0,#0x458
008df290	add x1,x1,#0x468
008df294	bl 0x00c2ffd0
008df298	mov x0,x22
008df29c	mov w1,wzr
008df2a0	mov w2,#0xc00
008df2a4	bl 0x00c301c0
008df2a8	add x1,sp,#0x2, LSL #12
008df2ac	add x0,sp,#0x50
008df2b0	mov w2,#0x804
008df2b4	add x1,x1,#0x468
008df2b8	bl 0x00c2ffd0
008df2bc	ldp x25,x26,[sp, #0x38]
008df2c0	b 0x008df2d4
008df2c4	ldp q0,q1,[sp, #0x10]
008df2c8	str q1,[x28,x19, lsl #4]
008df2cc	str q0,[x23]
008df2d0	add x25,x25,#0x10
008df2d4	cmp x25,x26
008df2d8	b.eq 0x008df374
008df2dc	ldr q0,[x25]
008df2e0	str q0,[sp, #0x20]
008df2e4	ldp x1,x2,[sp, #0x20]
008df2e8	mov x0,x21
008df2ec	bl 0x008df008
008df2f0	ldp x2,x3,[x21]
008df2f4	bl 0x008dd964
008df2f8	mov x8,x0
008df2fc	mov x2,x1
008df300	stp x0,x1,[sp, #0x10]
008df304	add x0,sp,#0x1, LSL #12
008df308	mov x1,x8
008df30c	add x0,x0,#0x458
008df310	bl 0x008dd970
008df314	ldp x1,x2,[sp, #0x10]
008df318	add x0,sp,#0x2, LSL #12
008df31c	add x0,x0,#0x468
008df320	bl 0x008dd9cc
008df324	stp x0,x1,[sp, #0x10]
008df328	add x0,sp,#0x10
008df32c	bl 0x008dd93c
008df330	tbnz w0,#0x0,0x008df2d0
008df334	add x0,sp,#0x10
008df338	bl 0x008dd914
008df33c	add x23,x22,w0, SXTW  #0x4
008df340	mov w24,w0
008df344	mov x0,x23
008df348	bl 0x008dd93c
008df34c	sxtw x19,w24
008df350	tbnz w0,#0x0,0x008df2c4
008df354	ldp x1,x2,[x23]
008df358	add x0,sp,#0x10
008df35c	bl 0x008dd950
008df360	add x8,x28,x19, LSL #0x4
008df364	ldp x1,x2,[x8]
008df368	add x0,sp,#0x20
008df36c	bl 0x008dd950
008df370	b 0x008df328
008df374	ldr w8,[sp, #0x1c58]
008df378	ldr w9,[sp, #0x2c68]
008df37c	cmp w8,w9
008df380	b.le 0x008df42c
008df384	add x0,x21,#0x870
008df388	add x1,sp,#0x50
008df38c	bl 0x008df9c0
008df390	add x0,sp,#0x2, LSL #12
008df394	add x1,sp,#0x1, LSL #12
008df398	mov w2,#0x804
008df39c	add x0,x0,#0x468
008df3a0	add x1,x1,#0x458
008df3a4	mov w24,w20
008df3a8	bl 0x00c2ffd0
008df3ac	ldr x0,[sp, #0x38]
008df3b0	cbz x0,0x008df3c4
008df3b4	ldr x8,[sp, #0x48]
008df3b8	str x0,[sp, #0x40]
008df3bc	sub x1,x8,x0
008df3c0	bl 0x00c2fe80
008df3c4	cbz x27,0x008df3d4
008df3c8	ldr x1,[sp, #0x8]
008df3cc	mov x0,x27
008df3d0	bl 0x00c2fe80
008df3d4	ldr w8,[sp, #0x2c68]
008df3d8	cmp w24,#0xe
008df3dc	b.hi 0x008df3ec
008df3e0	cmp w8,#0x60
008df3e4	add w24,w24,#0x1
008df3e8	b.lt 0x008df158
008df3ec	cmp w8,#0x60
008df3f0	b.ne 0x008df488
008df3f4	ldr x8,[sp]
008df3f8	ldr x8,[x8, #0x28]
008df3fc	ldur x9,[x29, #-0x10]
008df400	cmp x8,x9
008df404	b.ne 0x008df56c
008df408	add sp,sp,#0x2, LSL #12
008df40c	add sp,sp,#0xc80
008df410	ldp x20,x19,[sp, #0x50]
008df414	ldp x22,x21,[sp, #0x40]
008df418	ldp x24,x23,[sp, #0x30]
008df41c	ldp x26,x25,[sp, #0x20]
008df420	ldp x28,x27,[sp, #0x10]
008df424	ldp x29,x30,[sp], #0x60
008df428	ret
008df42c	mov w0,#0x10
008df430	bl 0x00c30000
008df434	mov x21,x0
008df438	adrp x1,0x2ca000
008df43c	add x1,x1,#0xc5a
008df440	bl 0x00c30a80
008df444	ldr x8,[sp]
008df448	ldr x8,[x8, #0x28]
008df44c	ldur x9,[x29, #-0x10]
008df450	cmp x8,x9
008df454	b.ne 0x008df56c
008df458	adrp x1,0xcb4000
008df45c	adrp x2,0xcb4000
008df460	mov x0,x21
008df464	ldr x1,[x1, #0xc20]
008df468	ldr x2,[x2, #0xc28]
008df46c	bl 0x00c30020
008df470	ldr x8,[sp]
008df474	ldr x8,[x8, #0x28]
008df478	ldur x9,[x29, #-0x10]
008df47c	cmp x8,x9
008df480	b.ne 0x008df56c
008df484	bl 0x008ddc5c
008df488	mov w0,#0x10
008df48c	bl 0x00c30000
008df490	mov x19,x0
008df494	adrp x1,0x2cc000
008df498	add x1,x1,#0xc41
008df49c	bl 0x00c30a80
008df4a0	ldr x8,[sp]
008df4a4	ldr x8,[x8, #0x28]
008df4a8	ldur x9,[x29, #-0x10]
008df4ac	cmp x8,x9
008df4b0	b.ne 0x008df56c
008df4b4	adrp x1,0xcb4000
008df4b8	adrp x2,0xcb4000
008df4bc	mov x0,x19
008df4c0	ldr x1,[x1, #0xc20]
008df4c4	ldr x2,[x2, #0xc28]
008df4c8	bl 0x00c30020
008df56c	bl 0x00c2fec0
