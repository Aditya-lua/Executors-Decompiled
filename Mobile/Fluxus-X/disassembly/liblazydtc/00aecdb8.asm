; TXT_DB_read @ 00aecdb8
00aecdb8	sub sp,sp,#0x80
00aecdbc	stp x28,x27,[sp, #0x20]
00aecdc0	stp x26,x25,[sp, #0x30]
00aecdc4	stp x24,x23,[sp, #0x40]
00aecdc8	stp x22,x21,[sp, #0x50]
00aecdcc	stp x20,x19,[sp, #0x60]
00aecdd0	stp x29,x30,[sp, #0x70]
00aecdd4	add x29,sp,#0x70
00aecdd8	mov w21,w1
00aecddc	mov x22,x0
00aecde0	bl 0x00c37020
00aecde4	mov x20,x0
00aecde8	cbz x0,0x00aed020
00aecdec	mov w1,#0x200
00aecdf0	mov x0,x20
00aecdf4	bl 0x00c37000
00aecdf8	cbz x0,0x00aed020
00aecdfc	adrp x1,0x2ce000
00aece00	add x1,x1,#0x3a1
00aece04	mov w0,#0x40
00aece08	mov w2,#0x24
00aece0c	bl 0x00c32320
00aece10	mov x19,x0
00aece14	cbz x0,0x00aed02c
00aece18	mov x26,x19
00aece1c	mov x25,x19
00aece20	str w21,[x19]
00aece24	str xzr,[x26, #0x10]!
00aece28	str xzr,[x25, #0x18]!
00aece2c	bl 0x00c34780
00aece30	str x0,[x19, #0x8]
00aece34	cbz x0,0x00aed06c
00aece38	sbfiz x23,x21,#0x3,#0x20
00aece3c	adrp x1,0x2ce000
00aece40	add x1,x1,#0x3a1
00aece44	mov w2,#0x2b
00aece48	mov x0,x23
00aece4c	bl 0x00c32320
00aece50	str x0,[x26]
00aece54	cbz x0,0x00aed06c
00aece58	adrp x1,0x2ce000
00aece5c	add x1,x1,#0x3a1
00aece60	mov w2,#0x2d
00aece64	mov x0,x23
00aece68	bl 0x00c32320
00aece6c	str x0,[x25]
00aece70	cbz x0,0x00aed06c
00aece74	cmp w21,#0x1
00aece78	b.lt 0x00aecea4
00aece7c	mov x8,xzr
00aece80	mov w9,w21
00aece84	ldr x10,[x26]
00aece88	lsl x11,x8,#0x3
00aece8c	add x8,x8,#0x1
00aece90	cmp x9,x8
00aece94	str xzr,[x10, x11#0x0]
00aece98	ldr x10,[x25]
00aece9c	str xzr,[x10, x11#0x0]
00aecea0	b.ne 0x00aece84
00aecea4	sxtw x8,w21
00aecea8	ldr x9,[x20, #0x8]
00aeceac	str x8,[sp, #0x8]
00aeceb0	lsl w8,w21,#0x3
00aeceb4	add w8,w8,#0x8
00aeceb8	mov w28,wzr
00aecebc	mov w10,w21
00aecec0	mov w23,#0x200
00aecec4	sxtw x8,w8
00aecec8	stp x10,x8,[sp, #0x10]
00aececc	strb wzr,[x9, #0x1ff]
00aeced0	cbz w28,0x00aecee8
00aeced4	add w23,w23,#0x200
00aeced8	sxtw x1,w23
00aecedc	mov x0,x20
00aecee0	bl 0x00c37010
00aecee4	cbz x0,0x00aed038
00aecee8	ldr x8,[x20, #0x8]
00aeceec	sxtw x27,w28
00aecef0	sub w2,w23,w28
00aecef4	mov x0,x22
00aecef8	strb wzr,[x8, x27]
00aecefc	ldr x8,[x20, #0x8]
00aecf00	add x1,x8,x27
00aecf04	bl 0x00c38470
00aecf08	ldr x24,[x20, #0x8]
00aecf0c	add x0,x24,x27
00aecf10	ldrb w8,[x0]
00aecf14	cbz w8,0x00aed02c
00aecf18	cbnz w28,0x00aecf28
00aecf1c	ldrb w8,[x24]
00aecf20	cmp w8,#0x23
00aecf24	b.eq 0x00aeced0
00aecf28	bl 0x00c2ff50
00aecf2c	add x28,x27,w0, SXTW 
00aecf30	sub x8,x28,#0x1
00aecf34	ldrb w9,[x24, x8]
00aecf38	cmp w9,#0xa
00aecf3c	b.ne 0x00aeced0
00aecf40	strb wzr,[x24, x8]
00aecf44	ldr x8,[sp, #0x18]
00aecf48	adrp x1,0x2ce000
00aecf4c	mov w2,#0x49
00aecf50	add x1,x1,#0x3a1
00aecf54	add w8,w28,w8
00aecf58	sxtw x0,w8
00aecf5c	bl 0x00c32320
00aecf60	cbz x0,0x00aed038
00aecf64	ldr x8,[sp, #0x18]
00aecf68	mov x24,x0
00aecf6c	mov w10,#0x1
00aecf70	add x8,x0,x8
00aecf74	str x8,[x0]
00aecf78	ldr x9,[x20, #0x8]
00aecf7c	b 0x00aecf8c
00aecf80	add x11,x10,#0x1
00aecf84	str x8,[x24, x10, LSL #0x3]
00aecf88	mov x10,x11
00aecf8c	mov w12,wzr
00aecf90	b 0x00aecfa4
00aecf94	cmp w11,#0x5c
00aecf98	add x9,x9,#0x1
00aecf9c	cset w12,eq
00aecfa0	strb w11,[x8], #0x1
00aecfa4	ldrb w11,[x9]
00aecfa8	cmp w11,#0x9
00aecfac	b.eq 0x00aecfb8
00aecfb0	cbnz w11,0x00aecf94
00aecfb4	b 0x00aecfd8
00aecfb8	cbz w12,0x00aecfc4
00aecfbc	sub x8,x8,#0x1
00aecfc0	b 0x00aecf94
00aecfc4	ldr x11,[sp, #0x8]
00aecfc8	strb wzr,[x8], #0x1
00aecfcc	add x9,x9,#0x1
00aecfd0	cmp x10,x11
00aecfd4	b.lt 0x00aecf80
00aecfd8	cmp w10,w21
00aecfdc	strb wzr,[x8], #0x1
00aecfe0	b.ne 0x00aed050
00aecfe4	ldrb w9,[x9]
00aecfe8	cbnz w9,0x00aed050
00aecfec	ldr x9,[sp, #0x10]
00aecff0	mov x1,x24
00aecff4	str x8,[x24, x9, LSL #0x3]
00aecff8	ldr x0,[x19, #0x8]
00aecffc	bl 0x00c347a0
00aed000	mov w28,wzr
00aed004	cbnz w0,0x00aeced0
00aed008	adrp x1,0x2ce000
00aed00c	add x1,x1,#0x3a1
00aed010	mov w2,#0x6f
00aed014	mov x0,x24
00aed018	bl 0x00c32310
00aed01c	b 0x00aed06c
00aed020	mov x0,x20
00aed024	bl 0x00c35660
00aed028	b 0x00aed0b4
00aed02c	mov x0,x20
00aed030	bl 0x00c35660
00aed034	b 0x00aed0b8
00aed038	mov x0,x20
00aed03c	bl 0x00c35660
00aed040	cbz x19,0x00aed0b8
00aed044	add x26,x19,#0x10
00aed048	add x25,x19,#0x18
00aed04c	b 0x00aed074
00aed050	adrp x1,0x2ce000
00aed054	add x1,x1,#0x3a1
00aed058	mov w2,#0x69
00aed05c	mov x0,x24
00aed060	bl 0x00c32310
00aed064	orr w8,wzr,#0x6
00aed068	str x8,[x19, #0x20]
00aed06c	mov x0,x20
00aed070	bl 0x00c35660
00aed074	ldr x0,[x19, #0x8]
00aed078	bl 0x00c34770
00aed07c	ldr x0,[x26]
00aed080	adrp x20,0x2ce000
00aed084	add x20,x20,#0x3a1
00aed088	mov w2,#0x79
00aed08c	mov x1,x20
00aed090	bl 0x00c32310
00aed094	ldr x0,[x25]
00aed098	mov w2,#0x7a
00aed09c	mov x1,x20
00aed0a0	bl 0x00c32310
00aed0a4	mov w2,#0x7b
00aed0a8	mov x0,x19
00aed0ac	mov x1,x20
00aed0b0	bl 0x00c32310
00aed0b4	mov x19,xzr
00aed0b8	mov x0,x19
00aed0bc	ldp x29,x30,[sp, #0x70]
00aed0c0	ldp x20,x19,[sp, #0x60]
00aed0c4	ldp x22,x21,[sp, #0x50]
00aed0c8	ldp x24,x23,[sp, #0x40]
00aed0cc	ldp x26,x25,[sp, #0x30]
00aed0d0	ldp x28,x27,[sp, #0x20]
00aed0d4	add sp,sp,#0x80
00aed0d8	ret
