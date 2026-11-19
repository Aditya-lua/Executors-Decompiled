; tls1_check_group_id @ 009c195c
009c195c	sub sp,sp,#0x30
009c1960	tst w1,#0xffff
009c1964	stp x20,x19,[sp, #0x10]
009c1968	stp x29,x30,[sp, #0x20]
009c196c	add x29,sp,#0x20
009c1970	b.eq 0x009c1b50
009c1974	ldr x8,[x0, #0x898]
009c1978	mov w19,w1
009c197c	mov x20,x0
009c1980	ldr w8,[x8, #0x1c]
009c1984	ands w8,w8,#0x30000
009c1988	b.eq 0x009c19cc
009c198c	ldr x9,[x20, #0x2e0]
009c1990	cbz x9,0x009c19cc
009c1994	ldr w9,[x9, #0x18]
009c1998	mov w10,#0xc02c
009c199c	movk w10,#0x300, LSL #16
009c19a0	cmp w9,w10
009c19a4	b.eq 0x009c1a00
009c19a8	mov w10,#0xc02b
009c19ac	movk w10,#0x300, LSL #16
009c19b0	cmp w9,w10
009c19b4	mov w0,wzr
009c19b8	b.ne 0x009c1b54
009c19bc	and w9,w19,#0xffff
009c19c0	cmp w9,#0x17
009c19c4	mov w0,wzr
009c19c8	b.ne 0x009c1b54
009c19cc	cbz w2,0x009c1a44
009c19d0	and w9,w8,#0x3ffff
009c19d4	adrp x8,0x74c000
009c19d8	cmp w9,#0x30, LSL #12
009c19dc	add x8,x8,#0xd84
009c19e0	b.eq 0x009c1a14
009c19e4	cmp w9,#0x20, LSL #12
009c19e8	b.eq 0x009c1a1c
009c19ec	cmp w9,#0x10, LSL #12
009c19f0	b.ne 0x009c1ac8
009c19f4	adrp x8,0x74c000
009c19f8	add x8,x8,#0xd84
009c19fc	b 0x009c1a20
009c1a00	and w9,w19,#0xffff
009c1a04	cmp w9,#0x18
009c1a08	mov w0,wzr
009c1a0c	b.eq 0x009c19cc
009c1a10	b 0x009c1b54
009c1a14	mov w9,#0x2
009c1a18	b 0x009c1a24
009c1a1c	add x8,x8,#0x2
009c1a20	mov w9,#0x1
009c1a24	mov x10,xzr
009c1a28	ldrh w11,[x8, x10, LSL #0x1]
009c1a2c	cmp w11,w19, UXTH 
009c1a30	b.eq 0x009c1a44
009c1a34	add x10,x10,#0x1
009c1a38	cmp x10,x9
009c1a3c	b.cc 0x009c1a28
009c1a40	b 0x009c1b50
009c1a44	ldr x8,[x20, #0x9a8]
009c1a48	ldr x9,[x8, #0x630]
009c1a4c	cbz x9,0x009c1b50
009c1a50	ldr x8,[x8, #0x628]
009c1a54	mov x10,xzr
009c1a58	add x8,x8,#0x1c
009c1a5c	ldrh w11,[x8]
009c1a60	cmp w11,w19, UXTH 
009c1a64	b.eq 0x009c1a7c
009c1a68	add x10,x10,#0x1
009c1a6c	cmp x10,x9
009c1a70	add x8,x8,#0x38
009c1a74	b.cc 0x009c1a5c
009c1a78	b 0x009c1b50
009c1a7c	cmp x8,#0x1c
009c1a80	b.eq 0x009c1b50
009c1a84	lsr w10,w19,#0x8
009c1a88	strb w10,[sp, #0xc]
009c1a8c	strb w19,[sp, #0xd]
009c1a90	ldur w2,[x8, #-0x4]
009c1a94	adrp x8,0x74c000
009c1a98	add x8,x8,#0xc34
009c1a9c	mov x9,xzr
009c1aa0	add x8,x8,#0x4
009c1aa4	ldrh w10,[x8]
009c1aa8	cmp w10,w19, UXTH 
009c1aac	b.eq 0x009c1ae0
009c1ab0	add x9,x9,#0x1
009c1ab4	cmp x9,#0x2a
009c1ab8	add x8,x8,#0x8
009c1abc	b.cc 0x009c1aa4
009c1ac0	mov w3,wzr
009c1ac4	b 0x009c1ae4
009c1ac8	ldr x8,[x20, #0xac8]
009c1acc	cbz x8,0x009c1b3c
009c1ad0	add x9,x20,#0xac0
009c1ad4	ldr x9,[x9]
009c1ad8	cbnz x9,0x009c1a24
009c1adc	b 0x009c1b50
009c1ae0	ldur w3,[x8, #-0x4]
009c1ae4	mov w1,#0x6
009c1ae8	movk w1,#0x2, LSL #16
009c1aec	add x4,sp,#0xc
009c1af0	mov x0,x20
009c1af4	bl 0x00c34a30
009c1af8	cbz w0,0x009c1b54
009c1afc	ldr w8,[x20, #0x38]
009c1b00	cbz w8,0x009c1b34
009c1b04	ldr x8,[x20, #0xad0]
009c1b08	cbz x8,0x009c1b34
009c1b0c	ldr x9,[x20, #0xad8]
009c1b10	mov x10,xzr
009c1b14	ldrh w11,[x9, x10, LSL #0x1]
009c1b18	cmp w11,w19, UXTH 
009c1b1c	b.eq 0x009c1b34
009c1b20	add x10,x10,#0x1
009c1b24	cmp x10,x8
009c1b28	mov w0,wzr
009c1b2c	b.cc 0x009c1b14
009c1b30	b 0x009c1b54
009c1b34	mov w0,#0x1
009c1b38	b 0x009c1b54
009c1b3c	ldr x9,[x20, #0x9a8]
009c1b40	ldr x8,[x9, #0x288]
009c1b44	add x9,x9,#0x290
009c1b48	ldr x9,[x9]
009c1b4c	cbnz x9,0x009c1a24
009c1b50	mov w0,wzr
009c1b54	ldp x29,x30,[sp, #0x20]
009c1b58	ldp x20,x19,[sp, #0x10]
009c1b5c	add sp,sp,#0x30
009c1b60	ret
