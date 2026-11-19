; FUN_00946b9c @ 00946b9c
00946b9c	stp x20,x19,[sp, #-0x20]!
00946ba0	stp x29,x30,[sp, #0x10]
00946ba4	add x29,sp,#0x10
00946ba8	mov w2,wzr
00946bac	mov x19,x1
00946bb0	mov x20,x0
00946bb4	bl 0x00906f54
00946bb8	mov w2,#0x1
00946bbc	mov x0,x20
00946bc0	mov x1,x19
00946bc4	bl 0x00906f54
00946bc8	adrp x20,0xcc4000
00946bcc	add x20,x20,#0x678
00946bd0	ldr x0,[x19, #0xf0]
00946bd4	ldr x8,[x20]
00946bd8	blr x8
00946bdc	str xzr,[x19, #0xf0]
00946be0	ldr x8,[x20]
00946be4	ldr x0,[x19, #0xb8]
00946be8	blr x8
00946bec	str xzr,[x19, #0xb8]
00946bf0	ldr x8,[x20]
00946bf4	ldr x0,[x19, #0xf8]
00946bf8	blr x8
00946bfc	str xzr,[x19, #0xf8]
00946c00	ldr x8,[x20]
00946c04	ldr x0,[x19, #0xc0]
00946c08	blr x8
00946c0c	str xzr,[x19, #0xc0]
00946c10	ldr x8,[x20]
00946c14	ldr x0,[x19, #0xc8]
00946c18	blr x8
00946c1c	str xzr,[x19, #0xc8]
00946c20	ldr x8,[x20]
00946c24	ldr x0,[x19, #0x90]
00946c28	blr x8
00946c2c	str xzr,[x19, #0x90]
00946c30	ldr x8,[x20]
00946c34	ldr x0,[x19, #0x1c8]
00946c38	blr x8
00946c3c	str xzr,[x19, #0x1c8]
00946c40	ldr x8,[x20]
00946c44	ldr x0,[x19, #0x1d0]
00946c48	blr x8
00946c4c	str xzr,[x19, #0x1d0]
00946c50	ldr x8,[x20]
00946c54	ldr x0,[x19, #0x1e0]
00946c58	blr x8
00946c5c	str xzr,[x19, #0x1e0]
00946c60	ldr x8,[x20]
00946c64	ldr x0,[x19, #0x1d8]
00946c68	blr x8
00946c6c	str xzr,[x19, #0x1d8]
00946c70	ldr x8,[x20]
00946c74	ldr x0,[x19, #0x1e8]
00946c78	blr x8
00946c7c	str xzr,[x19, #0x1e8]
00946c80	ldr x8,[x20]
00946c84	ldr x0,[x19, #0x40]
00946c88	blr x8
00946c8c	str xzr,[x19, #0x40]
00946c90	ldr x8,[x20]
00946c94	ldr x0,[x19, #0x70]
00946c98	blr x8
00946c9c	str xzr,[x19, #0x70]
00946ca0	ldr x8,[x20]
00946ca4	ldr x0,[x19, #0x60]
00946ca8	blr x8
00946cac	str xzr,[x19, #0x60]
00946cb0	ldr x8,[x20]
00946cb4	ldr x0,[x19, #0x68]
00946cb8	blr x8
00946cbc	str xzr,[x19, #0x68]
00946cc0	ldr x8,[x20]
00946cc4	ldr x0,[x19, #0x550]
00946cc8	blr x8
00946ccc	mov x0,x19
00946cd0	str xzr,[x19, #0x550]
00946cd4	bl 0x0096807c
00946cd8	ldr x8,[x20]
00946cdc	ldr x0,[x19, #0x548]
00946ce0	blr x8
00946ce4	str xzr,[x19, #0x548]
00946ce8	ldr x1,[x20]
00946cec	ldp x29,x30,[sp, #0x10]
00946cf0	mov x0,x19
00946cf4	ldp x20,x19,[sp], #0x20
00946cf8	br x1
