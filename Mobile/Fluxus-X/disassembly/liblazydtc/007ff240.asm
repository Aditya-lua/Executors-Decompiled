; FUN_007ff240 @ 007ff240
007ff240	stp x29,x30,[sp, #-0x60]!
007ff244	str x27,[sp, #0x10]
007ff248	stp x26,x25,[sp, #0x20]
007ff24c	stp x24,x23,[sp, #0x30]
007ff250	stp x22,x21,[sp, #0x40]
007ff254	stp x20,x19,[sp, #0x50]
007ff258	mov x29,sp
007ff25c	ldp x23,x21,[x0]
007ff260	mov x19,x0
007ff264	mov x20,x1
007ff268	cmp x21,x23
007ff26c	b.eq 0x007ff278
007ff270	mov x22,x21
007ff274	b 0x007ff3a8
007ff278	ldp x26,x8,[x19, #0x10]
007ff27c	cmp x26,x8
007ff280	b.cs 0x007ff2c8
007ff284	sub x8,x8,x26
007ff288	subs x9,x26,x21
007ff28c	asr x8,x8,#0x3
007ff290	subs x2,x26,x21
007ff294	add x8,x8,#0x1
007ff298	add x8,x8,x8, LSR #0x3f
007ff29c	asr x23,x8,#0x1
007ff2a0	add x8,x26,x23, LSL #0x3
007ff2a4	sub x22,x8,x9
007ff2a8	b.eq 0x007ff2bc
007ff2ac	mov x0,x22
007ff2b0	mov x1,x21
007ff2b4	bl 0x00c2ff60
007ff2b8	ldr x26,[x19, #0x10]
007ff2bc	add x8,x26,x23, LSL #0x3
007ff2c0	str x8,[x19, #0x10]
007ff2c4	b 0x007ff3a8
007ff2c8	subs x24,x8,x21
007ff2cc	asr x8,x24,#0x2
007ff2d0	csinc x8,x8,xzr,ne
007ff2d4	lsr x9,x8,#0x3d
007ff2d8	cbnz x9,0x007ff3d0
007ff2dc	lsl x25,x8,#0x3
007ff2e0	add x9,x8,#0x3
007ff2e4	lsr x27,x9,#0x2
007ff2e8	mov x0,x25
007ff2ec	bl 0x00c2fed0
007ff2f0	add x22,x0,x27, LSL #0x3
007ff2f4	subs x10,x26,x21
007ff2f8	add x8,x0,x25
007ff2fc	mov x9,x22
007ff300	b.eq 0x007ff38c
007ff304	sub x12,x10,#0x8
007ff308	add x9,x22,x10
007ff30c	mov x10,x22
007ff310	cmp x12,#0x38
007ff314	mov x11,x21
007ff318	b.cc 0x007ff37c
007ff31c	lsl x10,x27,#0x3
007ff320	mov x11,x21
007ff324	add x15,x10,x0
007ff328	sub x10,x15,x21
007ff32c	cmp x10,#0x20
007ff330	mov x10,x22
007ff334	b.cc 0x007ff37c
007ff338	lsr x10,x12,#0x3
007ff33c	add x14,x21,#0x10
007ff340	add x15,x15,#0x10
007ff344	add x12,x10,#0x1
007ff348	and x13,x12,#0x3ffffffffffffffc
007ff34c	lsl x11,x13,#0x3
007ff350	mov x16,x13
007ff354	add x10,x22,x11
007ff358	add x11,x21,x11
007ff35c	ldp q0,q1,[x14, #-0x10]
007ff360	subs x16,x16,#0x4
007ff364	add x14,x14,#0x20
007ff368	stp q0,q1,[x15, #-0x10]
007ff36c	add x15,x15,#0x20
007ff370	b.ne 0x007ff35c
007ff374	cmp x12,x13
007ff378	b.eq 0x007ff38c
007ff37c	ldr x12,[x11], #0x8
007ff380	str x12,[x10], #0x8
007ff384	cmp x10,x9
007ff388	b.ne 0x007ff37c
007ff38c	stp x0,x22,[x19]
007ff390	stp x9,x8,[x19, #0x10]
007ff394	cbz x21,0x007ff3a8
007ff398	mov x0,x23
007ff39c	mov x1,x24
007ff3a0	bl 0x00c2fe80
007ff3a4	ldr x22,[x19, #0x8]
007ff3a8	ldr x8,[x20]
007ff3ac	str x8,[x22, #-0x8]!
007ff3b0	str x22,[x19, #0x8]
007ff3b4	ldp x20,x19,[sp, #0x50]
007ff3b8	ldr x27,[sp, #0x10]
007ff3bc	ldp x22,x21,[sp, #0x40]
007ff3c0	ldp x24,x23,[sp, #0x30]
007ff3c4	ldp x26,x25,[sp, #0x20]
007ff3c8	ldp x29,x30,[sp], #0x60
007ff3cc	ret
007ff3d0	bl 0x007fe1b8
