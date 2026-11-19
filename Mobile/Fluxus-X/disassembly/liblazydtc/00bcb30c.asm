; std::__ndk1::system_error::system_error @ 00bcb30c
00bcb30c	paciasp
00bcb310	sub sp,sp,#0x60
00bcb314	stp x29,x30,[sp, #0x40]
00bcb318	str x19,[sp, #0x50]
00bcb31c	add x29,sp,#0x40
00bcb320	ldrb w8,[x3]
00bcb324	mov x19,x0
00bcb328	stp x1,x2,[x29, #-0x10]
00bcb32c	tbnz w8,#0x0,0x00bcb344
00bcb330	ldr q0,[x3]
00bcb334	ldr x8,[x3, #0x10]
00bcb338	str q0,[sp]
00bcb33c	str x8,[sp, #0x10]
00bcb340	b 0x00bcb350
00bcb344	ldp x2,x1,[x3, #0x8]
00bcb348	mov x0,sp
00bcb34c	bl 0x007ff40c
00bcb350	add x8,sp,#0x18
00bcb354	sub x0,x29,#0x10
00bcb358	mov x1,sp
00bcb35c	bl 0x00bcb424
00bcb360	add x1,sp,#0x18
00bcb364	mov x0,x19
00bcb368	bl 0x00c43cf0
00bcb36c	ldrb w8,[sp, #0x18]
00bcb370	tbz w8,#0x0,0x00bcb384
00bcb374	ldr x8,[sp, #0x18]
00bcb378	ldr x0,[sp, #0x28]
00bcb37c	and x1,x8,#-0x2
00bcb380	bl 0x00c2fe80
00bcb384	ldrb w8,[sp]
00bcb388	tbz w8,#0x0,0x00bcb39c
00bcb38c	ldr x8,[sp]
00bcb390	ldr x0,[sp, #0x10]
00bcb394	and x1,x8,#-0x2
00bcb398	bl 0x00c2fe80
00bcb39c	adrp x8,0xcb5000
00bcb3a0	ldr x8,[x8, #0xb18]
00bcb3a4	ldur q0,[x29, #-0x10]
00bcb3a8	add x8,x8,#0x10
00bcb3ac	str x8,[x19]
00bcb3b0	str q0,[x19, #0x10]
00bcb3b4	ldp x29,x30,[sp, #0x40]
00bcb3b8	ldr x19,[sp, #0x50]
00bcb3bc	add sp,sp,#0x60
00bcb3c0	autiasp
00bcb3c4	ret
