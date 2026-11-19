; std::__ndk1::basic_ostream<wchar_t,std::__ndk1::char_traits<wchar_t>>::operator<< @ 00bd6f7c
00bd6f7c	paciasp
00bd6f80	sub sp,sp,#0x40
00bd6f84	stp x29,x30,[sp, #0x10]
00bd6f88	stp x22,x21,[sp, #0x20]
00bd6f8c	stp x20,x19,[sp, #0x30]
00bd6f90	add x29,sp,#0x10
00bd6f94	mov x20,x1
00bd6f98	mov x19,x0
00bd6f9c	mov x0,sp
00bd6fa0	mov x1,x19
00bd6fa4	bl 0x00c44040
00bd6fa8	ldrb w8,[sp]
00bd6fac	cmp w8,#0x1
00bd6fb0	b.ne 0x00bd70b4
00bd6fb4	ldr x8,[x19]
00bd6fb8	ldur x8,[x8, #-0x18]
00bd6fbc	add x0,x19,x8
00bd6fc0	cbz x20,0x00bd70a8
00bd6fc4	ldr x21,[x0, #0x28]
00bd6fc8	mov x22,xzr
00bd6fcc	b 0x00bd6fdc
00bd6fd0	add x8,x8,#0x4
00bd6fd4	str x8,[x20, #0x18]
00bd6fd8	sub x22,x22,#0x1
00bd6fdc	ldp x8,x9,[x20, #0x18]
00bd6fe0	cmp x8,x9
00bd6fe4	b.eq 0x00bd6ff0
00bd6fe8	ldr w0,[x8]
00bd6fec	b 0x00bd7000
00bd6ff0	ldr x8,[x20]
00bd6ff4	ldr x8,[x8, #0x48]
00bd6ff8	mov x0,x20
00bd6ffc	blr x8
00bd7000	cmn w0,#0x1
00bd7004	b.eq 0x00bd7088
00bd7008	ldp x8,x9,[x20, #0x18]
00bd700c	cmp x8,x9
00bd7010	b.eq 0x00bd701c
00bd7014	ldr w1,[x8]
00bd7018	b 0x00bd7030
00bd701c	ldr x8,[x20]
00bd7020	ldr x8,[x8, #0x48]
00bd7024	mov x0,x20
00bd7028	blr x8
00bd702c	mov w1,w0
00bd7030	cbz x21,0x00bd708c
00bd7034	ldp x8,x9,[x21, #0x30]
00bd7038	cmp x8,x9
00bd703c	b.eq 0x00bd704c
00bd7040	str w1,[x8], #0x4
00bd7044	str x8,[x21, #0x30]
00bd7048	b 0x00bd7060
00bd704c	ldr x8,[x21]
00bd7050	ldr x8,[x8, #0x68]
00bd7054	mov x0,x21
00bd7058	blr x8
00bd705c	mov w1,w0
00bd7060	cmn w1,#0x1
00bd7064	b.eq 0x00bd7088
00bd7068	ldp x8,x9,[x20, #0x18]
00bd706c	cmp x8,x9
00bd7070	b.ne 0x00bd6fd0
00bd7074	ldr x8,[x20]
00bd7078	ldr x8,[x8, #0x50]
00bd707c	mov x0,x20
00bd7080	blr x8
00bd7084	b 0x00bd6fd8
00bd7088	cbnz x22,0x00bd70b4
00bd708c	ldr x8,[x19]
00bd7090	ldur x8,[x8, #-0x18]
00bd7094	add x0,x19,x8
00bd7098	ldr w8,[x0, #0x20]
00bd709c	orr w1,w8,#0x4
00bd70a0	bl 0x00c30130
00bd70a4	b 0x00bd70b4
00bd70a8	ldr w8,[x0, #0x20]
00bd70ac	orr w1,w8,#0x1
00bd70b0	bl 0x00c30130
00bd70b4	mov x0,sp
00bd70b8	bl 0x00c44050
00bd70bc	mov x0,x19
00bd70c0	ldp x20,x19,[sp, #0x30]
00bd70c4	ldp x22,x21,[sp, #0x20]
00bd70c8	ldp x29,x30,[sp, #0x10]
00bd70cc	add sp,sp,#0x40
00bd70d0	autiasp
00bd70d4	ret
