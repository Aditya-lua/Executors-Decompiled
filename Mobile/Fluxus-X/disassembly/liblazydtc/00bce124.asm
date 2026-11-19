; std::__ndk1::ios_base::copyfmt @ 00bce124
00bce124	paciasp
00bce128	stp x29,x30,[sp, #-0x40]!
00bce12c	stp x24,x23,[sp, #0x10]
00bce130	stp x22,x21,[sp, #0x20]
00bce134	stp x20,x19,[sp, #0x30]
00bce138	mov x29,sp
00bce13c	ldr x8,[x0, #0x50]
00bce140	ldr x20,[x1, #0x48]
00bce144	mov x21,x1
00bce148	mov x22,x0
00bce14c	cmp x8,x20
00bce150	b.cs 0x00bce178
00bce154	lsl x0,x20,#0x3
00bce158	bl 0x00c308d0
00bce15c	cbz x0,0x00bce380
00bce160	mov x19,x0
00bce164	lsl x0,x20,#0x2
00bce168	bl 0x00c308d0
00bce16c	cbz x0,0x00bce384
00bce170	mov x20,x0
00bce174	b 0x00bce180
00bce178	mov x20,xzr
00bce17c	mov x19,xzr
00bce180	ldr x9,[x22, #0x68]
00bce184	ldr x8,[x21, #0x60]
00bce188	cmp x9,x8
00bce18c	b.cs 0x00bce1a4
00bce190	lsl x0,x8,#0x3
00bce194	bl 0x00c308d0
00bce198	mov x23,x0
00bce19c	cbnz x0,0x00bce1a8
00bce1a0	bl 0x00c43cc0
00bce1a4	mov x23,xzr
00bce1a8	ldr x9,[x22, #0x80]
00bce1ac	ldr x8,[x21, #0x78]
00bce1b0	cmp x9,x8
00bce1b4	b.cs 0x00bce1cc
00bce1b8	lsl x0,x8,#0x3
00bce1bc	bl 0x00c308d0
00bce1c0	mov x24,x0
00bce1c4	cbnz x0,0x00bce1d0
00bce1c8	bl 0x00c43cc0
00bce1cc	mov x24,xzr
00bce1d0	ldr w8,[x21, #0x8]
00bce1d4	ldr q0,[x21, #0x10]
00bce1d8	add x0,x22,#0x30
00bce1dc	add x1,x21,#0x30
00bce1e0	str w8,[x22, #0x8]
00bce1e4	str q0,[x22, #0x10]
00bce1e8	bl 0x00c43f00
00bce1ec	ldr x8,[x22, #0x50]
00bce1f0	ldr x9,[x21, #0x48]
00bce1f4	cmp x8,x9
00bce1f8	b.cs 0x00bce224
00bce1fc	ldr x0,[x22, #0x38]
00bce200	bl 0x00c30960
00bce204	ldr x0,[x22, #0x40]
00bce208	str x19,[x22, #0x38]
00bce20c	bl 0x00c30960
00bce210	ldr x8,[x21, #0x48]
00bce214	mov x19,xzr
00bce218	str x20,[x22, #0x40]
00bce21c	mov x20,xzr
00bce220	str x8,[x22, #0x50]
00bce224	str xzr,[x22, #0x48]
00bce228	ldr x8,[x21, #0x48]
00bce22c	cbz x8,0x00bce268
00bce230	mov x8,xzr
00bce234	ldr x9,[x21, #0x38]
00bce238	ldr x10,[x22, #0x38]
00bce23c	ldr x9,[x9, x8, LSL #0x3]
00bce240	str x9,[x10, x8, LSL #0x3]
00bce244	ldr x9,[x21, #0x40]
00bce248	ldr x10,[x22, #0x40]
00bce24c	ldr w9,[x9, x8, LSL #0x2]
00bce250	str w9,[x10, x8, LSL #0x2]
00bce254	add x8,x8,#0x1
00bce258	str x8,[x22, #0x48]
00bce25c	ldr x9,[x21, #0x48]
00bce260	cmp x8,x9
00bce264	b.cc 0x00bce234
00bce268	ldr x8,[x22, #0x68]
00bce26c	ldr x9,[x21, #0x60]
00bce270	cmp x8,x9
00bce274	b.cs 0x00bce290
00bce278	ldr x0,[x22, #0x58]
00bce27c	bl 0x00c30960
00bce280	ldr x8,[x21, #0x60]
00bce284	str x23,[x22, #0x58]
00bce288	mov x23,xzr
00bce28c	str x8,[x22, #0x68]
00bce290	str xzr,[x22, #0x60]
00bce294	ldr x8,[x21, #0x60]
00bce298	cbz x8,0x00bce2c8
00bce29c	ldr x8,[x21, #0x58]
00bce2a0	ldr x9,[x22, #0x58]
00bce2a4	mov x10,xzr
00bce2a8	ldr x11,[x8, x10, LSL #0x3]
00bce2ac	str x11,[x9, x10, LSL #0x3]
00bce2b0	ldr x10,[x22, #0x60]
00bce2b4	add x10,x10,#0x1
00bce2b8	str x10,[x22, #0x60]
00bce2bc	ldr x11,[x21, #0x60]
00bce2c0	cmp x10,x11
00bce2c4	b.cc 0x00bce2a8
00bce2c8	ldr x8,[x22, #0x80]
00bce2cc	ldr x9,[x21, #0x78]
00bce2d0	cmp x8,x9
00bce2d4	b.cs 0x00bce2f0
00bce2d8	ldr x0,[x22, #0x70]
00bce2dc	bl 0x00c30960
00bce2e0	ldr x8,[x21, #0x78]
00bce2e4	str x24,[x22, #0x70]
00bce2e8	mov x24,xzr
00bce2ec	str x8,[x22, #0x80]
00bce2f0	str xzr,[x22, #0x78]
00bce2f4	ldr x8,[x21, #0x78]
00bce2f8	cbz x8,0x00bce324
00bce2fc	mov x8,xzr
00bce300	ldr x9,[x21, #0x70]
00bce304	ldr x10,[x22, #0x70]
00bce308	ldr x9,[x9, x8, LSL #0x3]
00bce30c	str x9,[x10, x8, LSL #0x3]
00bce310	add x8,x8,#0x1
00bce314	str x8,[x22, #0x78]
00bce318	ldr x9,[x21, #0x78]
00bce31c	cmp x8,x9
00bce320	b.cc 0x00bce300
00bce324	cbz x24,0x00bce330
00bce328	mov x0,x24
00bce32c	bl 0x00c30960
00bce330	cbz x23,0x00bce33c
00bce334	mov x0,x23
00bce338	bl 0x00c30960
00bce33c	cbz x20,0x00bce348
00bce340	mov x0,x20
00bce344	bl 0x00c30960
00bce348	cbz x19,0x00bce368
00bce34c	mov x0,x19
00bce350	ldp x20,x19,[sp, #0x30]
00bce354	ldp x22,x21,[sp, #0x20]
00bce358	ldp x24,x23,[sp, #0x10]
00bce35c	ldp x29,x30,[sp], #0x40
00bce360	autiasp
00bce364	b 0x00c30960
00bce368	ldp x20,x19,[sp, #0x30]
00bce36c	ldp x22,x21,[sp, #0x20]
00bce370	ldp x24,x23,[sp, #0x10]
00bce374	ldp x29,x30,[sp], #0x40
00bce378	autiasp
00bce37c	ret
00bce380	bl 0x00c43cc0
00bce384	bl 0x00c43cc0
00bce388	mov x21,x0
00bce38c	cbnz x23,0x00bce3a0
00bce390	cbnz x20,0x00bce3c0
00bce394	cbnz x19,0x00bce3cc
00bce398	mov x0,x21
00bce39c	bl 0x00c2c090
00bce3a0	mov x0,x23
00bce3a4	bl 0x00c30960
00bce3a8	cbz x20,0x00bce394
00bce3ac	b 0x00bce3c0
00bce3c0	mov x0,x20
00bce3c4	bl 0x00c30960
00bce3c8	cbz x19,0x00bce398
00bce3cc	mov x0,x19
00bce3d0	bl 0x00c30960
00bce3d4	mov x0,x21
00bce3d8	bl 0x00c2c090
