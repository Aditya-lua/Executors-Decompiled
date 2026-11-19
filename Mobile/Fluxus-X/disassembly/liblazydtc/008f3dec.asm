; std::__ndk1::__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::destroy @ 008f3dec
008f3dec	stp x20,x19,[sp, #-0x20]!
008f3df0	stp x29,x30,[sp, #0x10]
008f3df4	add x29,sp,#0x10
008f3df8	mov x19,x1
008f3dfc	mov x20,x0
008f3e00	cbz x1,0x008f3e2c
008f3e04	ldr x1,[x19]
008f3e08	mov x0,x20
008f3e0c	bl 0x00c316d0
008f3e10	ldr x1,[x19, #0x8]
008f3e14	mov x0,x20
008f3e18	bl 0x00c316d0
008f3e1c	ldp x29,x30,[sp, #0x10]
008f3e20	mov x0,x19
008f3e24	ldp x20,x19,[sp], #0x20
008f3e28	b 0x00c301d0
008f3e2c	ldp x29,x30,[sp, #0x10]
008f3e30	ldp x20,x19,[sp], #0x20
008f3e34	ret
