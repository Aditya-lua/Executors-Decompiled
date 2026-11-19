; std::__ndk1::ios_base::failure::failure @ 00bcda28
00bcda28	paciasp
00bcda2c	stp x29,x30,[sp, #-0x20]!
00bcda30	str x19,[sp, #0x10]
00bcda34	mov x29,sp
00bcda38	mov x3,x1
00bcda3c	ldp x1,x2,[x2]
00bcda40	mov x19,x0
00bcda44	bl 0x00c43de0
00bcda48	adrp x8,0xcb5000
00bcda4c	ldr x8,[x8, #0xb30]
00bcda50	add x8,x8,#0x10
00bcda54	str x8,[x19]
00bcda58	ldr x19,[sp, #0x10]
00bcda5c	ldp x29,x30,[sp], #0x20
00bcda60	autiasp
00bcda64	ret
