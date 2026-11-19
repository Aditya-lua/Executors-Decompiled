; ASN1_TIME_to_generalizedtime @ 009eeee0
009eeee0	sub sp,sp,#0x70
009eeee4	stp x20,x19,[sp, #0x50]
009eeee8	mov x19,x1
009eeeec	str x21,[sp, #0x40]
009eeef0	stp x29,x30,[sp, #0x60]
009eeef4	add x29,sp,#0x60
009eeef8	cbz x0,0x009eef8c
009eeefc	mov x1,x0
009eef00	add x0,sp,#0x8
009eef04	bl 0x009ee624
009eef08	cbz w0,0x009eefd0
009eef0c	cbz x19,0x009eef1c
009eef10	ldr x21,[x19]
009eef14	mov x20,x21
009eef18	cbnz x21,0x009eef30
009eef1c	bl 0x00c37950
009eef20	mov x20,x0
009eef24	mov x21,xzr
009eef28	mov x0,xzr
009eef2c	cbz x20,0x009eefd4
009eef30	mov w2,#0x14
009eef34	mov x0,x20
009eef38	mov x1,xzr
009eef3c	bl 0x00c378a0
009eef40	cbz w0,0x009eefc0
009eef44	orr w8,wzr,#0x18
009eef48	str w8,[x20, #0x4]
009eef4c	ldp w9,w8,[sp, #0x18]
009eef50	ldr x0,[x20, #0x8]
009eef54	ldp w6,w5,[sp, #0x10]
009eef58	ldp w10,w7,[sp, #0x8]
009eef5c	adrp x2,0x2a2000
009eef60	add w3,w8,#0x76c
009eef64	add w4,w9,#0x1
009eef68	add x2,x2,#0x123
009eef6c	mov w1,#0x14
009eef70	str w10,[sp]
009eef74	bl 0x00c34d30
009eef78	str w0,[x20]
009eef7c	cbz x19,0x009eef84
009eef80	str x20,[x19]
009eef84	mov x0,x20
009eef88	b 0x009eefd4
009eef8c	sub x0,x29,#0x18
009eef90	bl 0x00c30970
009eef94	sub x0,x29,#0x18
009eef98	add x1,sp,#0x8
009eef9c	stp xzr,xzr,[sp, #0x30]
009eefa0	stp xzr,xzr,[sp, #0x20]
009eefa4	stp xzr,xzr,[sp, #0x10]
009eefa8	str xzr,[sp, #0x8]
009eefac	bl 0x00c37980
009eefb0	cmp x0,#0x0
009eefb4	cset w0,ne
009eefb8	cbnz w0,0x009eef0c
009eefbc	b 0x009eefd0
009eefc0	cmp x20,x21
009eefc4	b.eq 0x009eefd0
009eefc8	mov x0,x20
009eefcc	bl 0x00c37890
009eefd0	mov x0,xzr
009eefd4	ldp x29,x30,[sp, #0x60]
009eefd8	ldp x20,x19,[sp, #0x50]
009eefdc	ldr x21,[sp, #0x40]
009eefe0	add sp,sp,#0x70
009eefe4	ret
