; i2o_SCT @ 00a131f8
00a131f8	sub sp,sp,#0x40
00a131fc	stp x22,x21,[sp, #0x10]
00a13200	stp x20,x19,[sp, #0x20]
00a13204	stp x29,x30,[sp, #0x30]
00a13208	add x29,sp,#0x30
00a1320c	mov x22,x1
00a13210	mov x20,x0
00a13214	str xzr,[sp, #0x8]
00a13218	bl 0x00c39850
00a1321c	cbz w0,0x00a1325c
00a13220	ldr w8,[x20]
00a13224	cbz w8,0x00a132bc
00a13228	ldr x19,[x20, #0x10]
00a1322c	cbz x22,0x00a132a4
00a13230	ldr x0,[x22]
00a13234	cbz x0,0x00a132d4
00a13238	mov x21,xzr
00a1323c	str x0,[sp, #0x8]
00a13240	add x9,x0,x19
00a13244	str x9,[x22]
00a13248	cbz w8,0x00a13304
00a1324c	ldr x1,[x20, #0x8]
00a13250	mov x2,x19
00a13254	bl 0x00c2ffd0
00a13258	b 0x00a132a4
00a1325c	bl 0x00c342a0
00a13260	adrp x0,0x2d9000
00a13264	adrp x2,0x2b7000
00a13268	add x0,x0,#0xa3f
00a1326c	add x2,x2,#0x942
00a13270	mov w1,#0xce
00a13274	bl 0x00c342b0
00a13278	mov w0,#0x32
00a1327c	mov w1,#0x6a
00a13280	mov x2,xzr
00a13284	bl 0x00c342c0
00a13288	mov x21,xzr
00a1328c	adrp x1,0x2d9000
00a13290	add x1,x1,#0xa3f
00a13294	mov w2,#0xfd
00a13298	mov x0,x21
00a1329c	bl 0x00c32310
00a132a0	mov w19,#0xffffffff
00a132a4	mov w0,w19
00a132a8	ldp x29,x30,[sp, #0x30]
00a132ac	ldp x20,x19,[sp, #0x20]
00a132b0	ldp x22,x21,[sp, #0x10]
00a132b4	add sp,sp,#0x40
00a132b8	ret
00a132bc	ldr x9,[x20, #0x38]
00a132c0	ldr x10,[x20, #0x50]
00a132c4	add x9,x9,x10
00a132c8	add x19,x9,#0x2f
00a132cc	cbnz x22,0x00a13230
00a132d0	b 0x00a132a4
00a132d4	adrp x1,0x2d9000
00a132d8	add x1,x1,#0xa3f
00a132dc	mov w2,#0xe3
00a132e0	mov x0,x19
00a132e4	bl 0x00c32320
00a132e8	str x0,[sp, #0x8]
00a132ec	cbz x0,0x00a133cc
00a132f0	ldr w8,[x20]
00a132f4	mov x9,x0
00a132f8	mov x21,x0
00a132fc	str x9,[x22]
00a13300	cbnz w8,0x00a1324c
00a13304	add x8,x0,#0x1
00a13308	str x8,[sp, #0x8]
00a1330c	strb wzr,[x0]
00a13310	ldr x8,[x20, #0x18]
00a13314	ldr x9,[sp, #0x8]
00a13318	ldr q0,[x8, #0x10]
00a1331c	add x22,x9,#0x2a
00a13320	str q0,[x9, #0x10]
00a13324	ldr q0,[x8]
00a13328	str q0,[x9]
00a1332c	ldrb w8,[x20, #0x2f]
00a13330	strb w8,[x9, #0x20]
00a13334	ldrh w8,[x20, #0x2e]
00a13338	strb w8,[x9, #0x21]
00a1333c	ldr x8,[x20, #0x28]
00a13340	lsr x8,x8,#0x28
00a13344	strb w8,[x9, #0x22]
00a13348	ldr w8,[x20, #0x2c]
00a1334c	strb w8,[x9, #0x23]
00a13350	ldr x8,[x20, #0x28]
00a13354	lsr x8,x8,#0x18
00a13358	strb w8,[x9, #0x24]
00a1335c	ldr x8,[x20, #0x28]
00a13360	lsr x8,x8,#0x10
00a13364	strb w8,[x9, #0x25]
00a13368	ldr x8,[x20, #0x28]
00a1336c	lsr x8,x8,#0x8
00a13370	strb w8,[x9, #0x26]
00a13374	ldr x8,[x20, #0x28]
00a13378	strb w8,[x9, #0x27]
00a1337c	ldr x8,[x20, #0x38]
00a13380	lsr x8,x8,#0x8
00a13384	strb w8,[x9, #0x28]
00a13388	ldr x8,[x20, #0x38]
00a1338c	strb w8,[x9, #0x29]
00a13390	str x22,[sp, #0x8]
00a13394	ldr x2,[x20, #0x38]
00a13398	cbz x2,0x00a133b4
00a1339c	ldr x1,[x20, #0x30]
00a133a0	mov x0,x22
00a133a4	bl 0x00c2ffd0
00a133a8	ldr x8,[x20, #0x38]
00a133ac	add x8,x22,x8
00a133b0	str x8,[sp, #0x8]
00a133b4	add x1,sp,#0x8
00a133b8	mov x0,x20
00a133bc	bl 0x00a130b4
00a133c0	cmp w0,#0x1
00a133c4	b.ge 0x00a132a4
00a133c8	b 0x00a1328c
00a133cc	bl 0x00c342a0
00a133d0	adrp x0,0x2d9000
00a133d4	adrp x2,0x2b7000
00a133d8	add x0,x0,#0xa3f
00a133dc	add x2,x2,#0x942
00a133e0	mov w1,#0xe5
00a133e4	bl 0x00c342b0
00a133e8	mov w1,#0x100
00a133ec	mov w0,#0x32
00a133f0	movk w1,#0xc, LSL #16
00a133f4	b 0x00a13280
