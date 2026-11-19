; FUN_00bf72a8 @ 00bf72a8
00bf72a8	paciasp
00bf72ac	sub sp,sp,#0x50
00bf72b0	stp x29,x30,[sp, #0x20]
00bf72b4	stp x22,x21,[sp, #0x30]
00bf72b8	stp x20,x19,[sp, #0x40]
00bf72bc	add x29,sp,#0x20
00bf72c0	adrp x20,0xcb4000
00bf72c4	mov x19,x1
00bf72c8	mov x21,x0
00bf72cc	ldr x20,[x20, #0xc80]
00bf72d0	str x20,[sp, #0x8]
00bf72d4	ldar x8,[x20]
00bf72d8	cmn x8,#0x1
00bf72dc	b.eq 0x00bf7308
00bf72e0	add x8,sp,#0x8
00bf72e4	sub x9,x29,#0x8
00bf72e8	adrp x0,0xcb4000
00bf72ec	stur x8,[x29, #-0x8]
00bf72f0	nop
00bf72f4	adr x2,0xc0bab0
00bf72f8	str x9,[sp, #0x10]
00bf72fc	add x1,sp,#0x10
00bf7300	ldr x0,[x0, #0xc80]
00bf7304	bl 0x00c305d0
00bf7308	ldrsw x8,[x20, #0x8]
00bf730c	add x1,x19,#0x8
00bf7310	mov w0,#0x1
00bf7314	sub x22,x8,#0x1
00bf7318	bl 0x00c2bce0
00bf731c	mov x20,x21
00bf7320	ldp x8,x9,[x20, #0x10]!
00bf7324	sub x9,x9,x8
00bf7328	asr x10,x9,#0x3
00bf732c	cmp x10,x22
00bf7330	b.hi 0x00bf735c
00bf7334	add x9,x22,#0x1
00bf7338	subs x1,x9,x10
00bf733c	b.ls 0x00bf7350
00bf7340	mov x0,x20
00bf7344	bl 0x00c0b6e4
00bf7348	ldr x8,[x20]
00bf734c	b 0x00bf735c
00bf7350	b.cs 0x00bf735c
00bf7354	add x9,x8,x9, LSL #0x3
00bf7358	str x9,[x21, #0x18]
00bf735c	ldr x21,[x8, x22, LSL #0x3]
00bf7360	cbz x21,0x00bf7384
00bf7364	add x1,x21,#0x8
00bf7368	mov x0,#-0x1
00bf736c	bl 0x00c2bd10
00bf7370	cbnz x0,0x00bf7384
00bf7374	ldr x8,[x21]
00bf7378	mov x0,x21
00bf737c	ldr x8,[x8, #0x10]
00bf7380	blr x8
00bf7384	ldr x8,[x20]
00bf7388	str x19,[x8, x22, LSL #0x3]
00bf738c	ldp x20,x19,[sp, #0x40]
00bf7390	ldp x22,x21,[sp, #0x30]
00bf7394	ldp x29,x30,[sp, #0x20]
00bf7398	add sp,sp,#0x50
00bf739c	autiasp
00bf73a0	ret
