; FUN_00932a98 @ 00932a98
00932a98	str x21,[sp, #-0x30]!
00932a9c	stp x20,x19,[sp, #0x10]
00932aa0	stp x29,x30,[sp, #0x20]
00932aa4	add x29,sp,#0x20
00932aa8	adrp x21,0xcc4000
00932aac	add x21,x21,#0x678
00932ab0	mov x20,x0
00932ab4	ldr x0,[x0, #0xc8]
00932ab8	mov x19,x1
00932abc	ldr x8,[x21]
00932ac0	blr x8
00932ac4	str xzr,[x20, #0xc8]
00932ac8	ldr x8,[x21]
00932acc	ldr x0,[x20, #0xc0]
00932ad0	blr x8
00932ad4	ldrb w8,[x20, #0xdb]
00932ad8	str xzr,[x20, #0xc0]
00932adc	tbz w8,#0x1,0x00932ae8
00932ae0	add x0,x20,#0x68
00932ae4	bl 0x009242d4
00932ae8	mov x0,x19
00932aec	bl 0x009350e4
00932af0	mov x0,x19
00932af4	ldp x29,x30,[sp, #0x20]
00932af8	ldp x20,x19,[sp, #0x10]
00932afc	ldr x21,[sp], #0x30
00932b00	b 0x00911d38
