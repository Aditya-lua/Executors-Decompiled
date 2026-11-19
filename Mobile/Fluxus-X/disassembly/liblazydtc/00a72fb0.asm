; FUN_00a72fb0 @ 00a72fb0
00a72fb0	sub sp,sp,#0xd0
00a72fb4	stp x22,x21,[sp, #0xa0]
00a72fb8	stp x20,x19,[sp, #0xb0]
00a72fbc	stp x29,x30,[sp, #0xc0]
00a72fc0	ldr x8,[x2, #0x20]
00a72fc4	mov w21,w0
00a72fc8	add x29,sp,#0xc0
00a72fcc	mov x19,x2
00a72fd0	mov x0,x8
00a72fd4	mov x20,x1
00a72fd8	bl 0x00c37cd0
00a72fdc	cmp w0,#0x6
00a72fe0	b.eq 0x00a72ff8
00a72fe4	ldr x0,[x19, #0x20]
00a72fe8	bl 0x00c37cd0
00a72fec	cmp w0,#0x390
00a72ff0	mov w0,wzr
00a72ff4	b.ne 0x00a7305c
00a72ff8	ldr x0,[x19, #0x20]
00a72ffc	bl 0x00c3d8d0
00a73000	mov x22,x0
00a73004	bl 0x00c3db80
00a73008	cmp w0,#0x2
00a7300c	b.cc 0x00a73058
00a73010	add x1,sp,#0x50
00a73014	mov x2,sp
00a73018	mov x0,x22
00a7301c	bl 0x00c3db30
00a73020	cbz w0,0x00a73058
00a73024	ldr x8,[sp, #0x58]
00a73028	cbz x8,0x00a73058
00a7302c	ldr x9,[x19, #0x30]
00a73030	mov w0,wzr
00a73034	ldr w9,[x9, #0x8]
00a73038	cmp w9,#0x2
00a7303c	b.ne 0x00a7305c
00a73040	mov w0,w21
00a73044	mov x1,x20
00a73048	mov x2,x19
00a7304c	str x8,[x19, #0x20]
00a73050	bl 0x00a6fd84
00a73054	b 0x00a7305c
00a73058	mov w0,wzr
00a7305c	ldp x29,x30,[sp, #0xc0]
00a73060	ldp x20,x19,[sp, #0xb0]
00a73064	ldp x22,x21,[sp, #0xa0]
00a73068	add sp,sp,#0xd0
00a7306c	ret
