; std::__ndk1::__tree<unsigned_short,std::__ndk1::less<unsigned_short>,std::__ndk1::allocator<unsigned_short>>::__find_equal<unsigned_short> @ 008f3c1c
008f3c1c	add x8,x0,#0x8
008f3c20	cmp x8,x1
008f3c24	b.eq 0x008f3c38
008f3c28	ldrh w9,[x4]
008f3c2c	ldrh w10,[x1, #0x1a]
008f3c30	cmp w9,w10
008f3c34	b.cs 0x008f3c64
008f3c38	ldr x9,[x0]
008f3c3c	ldr x10,[x1]
008f3c40	mov x11,x1
008f3c44	cmp x9,x1
008f3c48	b.eq 0x008f3cb0
008f3c4c	cbz x10,0x008f3c88
008f3c50	mov x9,x10
008f3c54	mov x11,x9
008f3c58	ldr x9,[x9, #0x8]
008f3c5c	cbnz x9,0x008f3c54
008f3c60	b 0x008f3ca0
008f3c64	cmp w10,w9
008f3c68	b.cs 0x008f3d20
008f3c6c	mov x3,x1
008f3c70	ldr x11,[x3, #0x8]!
008f3c74	cbz x11,0x008f3d30
008f3c78	mov x10,x11
008f3c7c	ldr x11,[x11]
008f3c80	cbnz x11,0x008f3c78
008f3c84	b 0x008f3d5c
008f3c88	mov x11,x1
008f3c8c	mov x9,x11
008f3c90	ldr x11,[x11, #0x10]
008f3c94	ldr x12,[x11]
008f3c98	cmp x12,x9
008f3c9c	b.eq 0x008f3c8c
008f3ca0	ldrh w12,[x11, #0x1a]
008f3ca4	ldrh w9,[x4]
008f3ca8	cmp w12,w9
008f3cac	b.cs 0x008f3cc4
008f3cb0	cbz x10,0x008f3d14
008f3cb4	add x3,x11,#0x8
008f3cb8	mov x0,x3
008f3cbc	str x11,[x2]
008f3cc0	ret
008f3cc4	ldr x10,[x8]
008f3cc8	cbz x10,0x008f3dd4
008f3ccc	add x3,x0,#0x8
008f3cd0	b 0x008f3cd8
008f3cd4	mov x10,x8
008f3cd8	ldrh w8,[x10, #0x1a]
008f3cdc	cmp w9,w8
008f3ce0	b.cs 0x008f3cf4
008f3ce4	ldr x8,[x10]
008f3ce8	cbz x8,0x008f3d78
008f3cec	mov x3,x10
008f3cf0	b 0x008f3cd4
008f3cf4	cmp w8,w9
008f3cf8	b.cs 0x008f3d08
008f3cfc	mov x3,x10
008f3d00	ldr x8,[x3, #0x8]!
008f3d04	cbnz x8,0x008f3cd4
008f3d08	mov x0,x3
008f3d0c	str x10,[x2]
008f3d10	ret
008f3d14	mov x0,x1
008f3d18	str x1,[x2]
008f3d1c	ret
008f3d20	mov x0,x3
008f3d24	str x1,[x2]
008f3d28	str x1,[x3]
008f3d2c	ret
008f3d30	mov x11,x1
008f3d34	ldr x10,[x11, #0x10]!
008f3d38	ldr x12,[x10]
008f3d3c	cmp x12,x1
008f3d40	b.eq 0x008f3d5c
008f3d44	ldr x12,[x11]
008f3d48	mov x11,x12
008f3d4c	ldr x10,[x11, #0x10]!
008f3d50	ldr x13,[x10]
008f3d54	cmp x13,x12
008f3d58	b.ne 0x008f3d44
008f3d5c	cmp x10,x8
008f3d60	b.eq 0x008f3d70
008f3d64	ldrh w11,[x10, #0x1a]
008f3d68	cmp w9,w11
008f3d6c	b.cs 0x008f3d84
008f3d70	ldr x8,[x1, #0x8]
008f3d74	cbz x8,0x008f3de0
008f3d78	mov x0,x10
008f3d7c	str x10,[x2]
008f3d80	ret
008f3d84	ldr x10,[x8]
008f3d88	cbz x10,0x008f3dd4
008f3d8c	add x3,x0,#0x8
008f3d90	b 0x008f3d98
008f3d94	mov x10,x8
008f3d98	ldrh w8,[x10, #0x1a]
008f3d9c	cmp w9,w8
008f3da0	b.cs 0x008f3db4
008f3da4	ldr x8,[x10]
008f3da8	cbz x8,0x008f3d78
008f3dac	mov x3,x10
008f3db0	b 0x008f3d94
008f3db4	cmp w8,w9
008f3db8	b.cs 0x008f3dc8
008f3dbc	mov x3,x10
008f3dc0	ldr x8,[x3, #0x8]!
008f3dc4	cbnz x8,0x008f3d94
008f3dc8	mov x0,x3
008f3dcc	str x10,[x2]
008f3dd0	ret
008f3dd4	mov x0,x8
008f3dd8	str x8,[x2]
008f3ddc	ret
008f3de0	mov x0,x3
008f3de4	str x1,[x2]
008f3de8	ret
