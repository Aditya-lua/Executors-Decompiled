; FUN_00c2fbe0 @ 00c2fbe0
00c2fbe0	bti jc
00c2fbe4	ldp x2,x3,[x0, #0x10]
00c2fbe8	ldp x4,x5,[x0, #0x20]
00c2fbec	ldp x6,x7,[x0, #0x30]
00c2fbf0	ldp x8,x9,[x0, #0x40]
00c2fbf4	ldp x10,x11,[x0, #0x50]
00c2fbf8	ldp x12,x13,[x0, #0x60]
00c2fbfc	ldp x14,x15,[x0, #0x70]
00c2fc00	ldp x18,x19,[x0, #0x90]
00c2fc04	ldp x20,x21,[x0, #0xa0]
00c2fc08	ldp x22,x23,[x0, #0xb0]
00c2fc0c	ldp x24,x25,[x0, #0xc0]
00c2fc10	ldp x26,x27,[x0, #0xd0]
00c2fc14	ldp x28,x29,[x0, #0xe0]
00c2fc18	ldr x30,[x0, #0x100]
00c2fc1c	ldp d0,d1,[x0, #0x110]
00c2fc20	ldp d2,d3,[x0, #0x120]
00c2fc24	ldp d4,d5,[x0, #0x130]
00c2fc28	ldp d6,d7,[x0, #0x140]
00c2fc2c	ldp d8,d9,[x0, #0x150]
00c2fc30	ldp d10,d11,[x0, #0x160]
00c2fc34	ldp d12,d13,[x0, #0x170]
00c2fc38	ldp d14,d15,[x0, #0x180]
00c2fc3c	ldp d16,d17,[x0, #0x190]
00c2fc40	ldp d18,d19,[x0, #0x1a0]
00c2fc44	ldp d20,d21,[x0, #0x1b0]
00c2fc48	ldp d22,d23,[x0, #0x1c0]
00c2fc4c	ldp d24,d25,[x0, #0x1d0]
00c2fc50	ldp d26,d27,[x0, #0x1e0]
00c2fc54	ldp d28,d29,[x0, #0x1f0]
00c2fc58	ldr d30,[x0, #0x200]
00c2fc5c	ldr d31,[x0, #0x208]
00c2fc60	ldr x16,[x0, #0xf8]
00c2fc64	ldp x0,x1,[x0]
00c2fc68	mov sp,x16
00c2fc6c	mov x16,#0x1
00c2fc70	hint 0x28
00c2fc74	cbnz x16,0x00c2fc7c
00c2fc78	sys 0x3, 0x7, 0x7, 0x0, x30
00c2fc7c	ret
