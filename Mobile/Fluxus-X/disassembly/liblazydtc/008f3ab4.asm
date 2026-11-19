; std::__ndk1::function<void(cpr::DebugCallback::InfoType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,long)>::swap @ 008f3ab4
008f3ab4	sub sp,sp,#0x60
008f3ab8	str x21,[sp, #0x30]
008f3abc	stp x20,x19,[sp, #0x40]
008f3ac0	stp x29,x30,[sp, #0x50]
008f3ac4	add x29,sp,#0x50
008f3ac8	mrs x21,tpidr_el0
008f3acc	ldr x8,[x21, #0x28]
008f3ad0	mov x19,x1
008f3ad4	mov x20,x0
008f3ad8	cmp x1,x0
008f3adc	str x8,[sp, #0x28]
008f3ae0	b.eq 0x008f3bec
008f3ae4	ldr x0,[x20, #0x20]
008f3ae8	cmp x0,x20
008f3aec	b.eq 0x008f3b08
008f3af0	ldr x8,[x19, #0x20]
008f3af4	cmp x19,x8
008f3af8	b.eq 0x008f3b40
008f3afc	str x8,[x20, #0x20]
008f3b00	str x0,[x19, #0x20]
008f3b04	b 0x008f3bec
008f3b08	ldr x8,[x19, #0x20]
008f3b0c	cmp x8,x19
008f3b10	b.eq 0x008f3b74
008f3b14	ldr x8,[x0]
008f3b18	ldr x8,[x8, #0x18]
008f3b1c	mov x1,x19
008f3b20	blr x8
008f3b24	ldr x0,[x20, #0x20]
008f3b28	ldr x8,[x0]
008f3b2c	ldr x8,[x8, #0x20]
008f3b30	blr x8
008f3b34	ldr x8,[x19, #0x20]
008f3b38	str x8,[x20, #0x20]
008f3b3c	b 0x008f3be8
008f3b40	ldr x9,[x8]
008f3b44	ldr x9,[x9, #0x18]
008f3b48	mov x0,x8
008f3b4c	mov x1,x20
008f3b50	blr x9
008f3b54	ldr x0,[x19, #0x20]
008f3b58	ldr x8,[x0]
008f3b5c	ldr x8,[x8, #0x20]
008f3b60	blr x8
008f3b64	ldr x8,[x20, #0x20]
008f3b68	str x8,[x19, #0x20]
008f3b6c	str x20,[x20, #0x20]
008f3b70	b 0x008f3bec
008f3b74	ldr x8,[x0]
008f3b78	ldr x8,[x8, #0x18]
008f3b7c	mov x1,sp
008f3b80	blr x8
008f3b84	ldr x0,[x20, #0x20]
008f3b88	ldr x8,[x0]
008f3b8c	ldr x8,[x8, #0x20]
008f3b90	blr x8
008f3b94	str xzr,[x20, #0x20]
008f3b98	ldr x0,[x19, #0x20]
008f3b9c	ldr x8,[x0]
008f3ba0	ldr x8,[x8, #0x18]
008f3ba4	mov x1,x20
008f3ba8	blr x8
008f3bac	ldr x0,[x19, #0x20]
008f3bb0	ldr x8,[x0]
008f3bb4	ldr x8,[x8, #0x20]
008f3bb8	blr x8
008f3bbc	str xzr,[x19, #0x20]
008f3bc0	str x20,[x20, #0x20]
008f3bc4	ldr x8,[sp]
008f3bc8	ldr x8,[x8, #0x18]
008f3bcc	mov x0,sp
008f3bd0	mov x1,x19
008f3bd4	blr x8
008f3bd8	ldr x8,[sp]
008f3bdc	mov x0,sp
008f3be0	ldr x8,[x8, #0x20]
008f3be4	blr x8
008f3be8	str x19,[x19, #0x20]
008f3bec	ldr x8,[x21, #0x28]
008f3bf0	ldr x9,[sp, #0x28]
008f3bf4	cmp x8,x9
008f3bf8	b.ne 0x008f3c10
008f3bfc	ldp x29,x30,[sp, #0x50]
008f3c00	ldp x20,x19,[sp, #0x40]
008f3c04	ldr x21,[sp, #0x30]
008f3c08	add sp,sp,#0x60
008f3c0c	ret
008f3c10	bl 0x00c2fec0
