; psa_hash_verify @ 00b87f70
00b87f70	sub sp,sp,#0x90
00b87f74	stp x24,x23,[sp, #0x50]
00b87f78	stp x22,x21,[sp, #0x60]
00b87f7c	stp x20,x19,[sp, #0x70]
00b87f80	stp x29,x30,[sp, #0x80]
00b87f84	add x29,sp,#0x80
00b87f88	mrs x24,tpidr_el0
00b87f8c	ldr x8,[x24, #0x28]
00b87f90	mov x22,x2
00b87f94	mov x23,x1
00b87f98	mov x19,x0
00b87f9c	stur x8,[x29, #-0x38]
00b87fa0	str xzr,[sp]
00b87fa4	ldr w8,[x0]
00b87fa8	mov w20,#0xffffff77
00b87fac	cbz w8,0x00b8802c
00b87fb0	cmp w8,#0x1
00b87fb4	b.ne 0x00b87fd4
00b87fb8	add x0,x19,#0x8
00b87fbc	add x1,sp,#0x8
00b87fc0	mov w2,#0x40
00b87fc4	mov x3,sp
00b87fc8	bl 0x00c43010
00b87fcc	ldr w8,[x19]
00b87fd0	mov w20,w0
00b87fd4	cbz w8,0x00b87fec
00b87fd8	cmp w8,#0x1
00b87fdc	b.ne 0x00b87fe8
00b87fe0	add x0,x19,#0x8
00b87fe4	bl 0x00c42fe0
00b87fe8	str wzr,[x19]
00b87fec	mov x21,xzr
00b87ff0	cbnz w20,0x00b88058
00b87ff4	ldr x8,[sp]
00b87ff8	cmp x8,x22
00b87ffc	b.ne 0x00b88034
00b88000	cbz x22,0x00b8803c
00b88004	mov w1,#0x1
00b88008	mov x0,x22
00b8800c	bl 0x00c30a30
00b88010	mov x21,x0
00b88014	cbz x0,0x00b880c8
00b88018	mov x0,x21
00b8801c	mov x1,x23
00b88020	mov x2,x22
00b88024	bl 0x00c2ffd0
00b88028	b 0x00b88040
00b8802c	mov x21,xzr
00b88030	b 0x00b88058
00b88034	mov x21,xzr
00b88038	b 0x00b88054
00b8803c	mov x21,xzr
00b88040	add x1,sp,#0x8
00b88044	mov x0,x21
00b88048	mov x2,x22
00b8804c	bl 0x00c42190
00b88050	cbz w0,0x00b880b4
00b88054	mov w20,#0xffffff6b
00b88058	add x0,sp,#0x8
00b8805c	mov w1,#0x40
00b88060	bl 0x00c42220
00b88064	ldr w8,[x19]
00b88068	cbz w8,0x00b88080
00b8806c	cmp w8,#0x1
00b88070	b.ne 0x00b8807c
00b88074	add x0,x19,#0x8
00b88078	bl 0x00c42fe0
00b8807c	str wzr,[x19]
00b88080	mov x0,x21
00b88084	bl 0x00c30960
00b88088	ldr x8,[x24, #0x28]
00b8808c	ldur x9,[x29, #-0x38]
00b88090	cmp x8,x9
00b88094	b.ne 0x00b880d0
00b88098	mov w0,w20
00b8809c	ldp x29,x30,[sp, #0x80]
00b880a0	ldp x20,x19,[sp, #0x70]
00b880a4	ldp x22,x21,[sp, #0x60]
00b880a8	ldp x24,x23,[sp, #0x50]
00b880ac	add sp,sp,#0x90
00b880b0	ret
00b880b4	add x0,sp,#0x8
00b880b8	mov w1,#0x40
00b880bc	bl 0x00c42220
00b880c0	mov w20,wzr
00b880c4	b 0x00b88080
00b880c8	mov w20,#0xffffff73
00b880cc	b 0x00b88058
00b880d0	bl 0x00c2fec0
