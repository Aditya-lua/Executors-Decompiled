; TXT_DB_write @ 00aed26c
00aed26c	sub sp,sp,#0x80
00aed270	stp x28,x27,[sp, #0x20]
00aed274	stp x26,x25,[sp, #0x30]
00aed278	stp x24,x23,[sp, #0x40]
00aed27c	stp x22,x21,[sp, #0x50]
00aed280	stp x20,x19,[sp, #0x60]
00aed284	stp x29,x30,[sp, #0x70]
00aed288	add x29,sp,#0x70
00aed28c	mov x21,x1
00aed290	str x0,[sp, #0x18]
00aed294	bl 0x00c37020
00aed298	mov x19,x0
00aed29c	cbz x0,0x00aed3b0
00aed2a0	ldr x0,[x21, #0x8]
00aed2a4	bl 0x00c325e0
00aed2a8	cmp w0,#0x1
00aed2ac	b.lt 0x00aed3b8
00aed2b0	sxtw x8,w0
00aed2b4	stp x8,x21,[sp, #0x8]
00aed2b8	ldrsw x22,[x21]
00aed2bc	mov x23,xzr
00aed2c0	mov x20,xzr
00aed2c4	mov w27,#0x9
00aed2c8	mov w28,#0x5c
00aed2cc	ldr x0,[x21, #0x8]
00aed2d0	mov w1,w23
00aed2d4	bl 0x00c32610
00aed2d8	cmp w22,#0x1
00aed2dc	mov x21,x0
00aed2e0	mov x25,xzr
00aed2e4	b.lt 0x00aed30c
00aed2e8	mov x26,x22
00aed2ec	mov x24,x21
00aed2f0	ldr x0,[x24]
00aed2f4	cbz x0,0x00aed300
00aed2f8	bl 0x00c2ff50
00aed2fc	add x25,x0,x25
00aed300	subs x26,x26,#0x1
00aed304	add x24,x24,#0x8
00aed308	b.ne 0x00aed2f0
00aed30c	add w8,w22,w25, LSL #0x1
00aed310	sxtw x1,w8
00aed314	mov x0,x19
00aed318	bl 0x00c37010
00aed31c	cbz x0,0x00aed3b0
00aed320	ldr x8,[x19, #0x8]
00aed324	cmp w22,#0x1
00aed328	b.lt 0x00aed374
00aed32c	mov x9,xzr
00aed330	ldr x10,[x21, x9, LSL #0x3]
00aed334	cbnz x10,0x00aed344
00aed338	b 0x00aed364
00aed33c	add x10,x10,#0x1
00aed340	strb w11,[x8], #0x1
00aed344	ldrb w11,[x10]
00aed348	cmp w11,#0x9
00aed34c	b.eq 0x00aed358
00aed350	cbnz w11,0x00aed33c
00aed354	b 0x00aed364
00aed358	strb w28,[x8], #0x1
00aed35c	ldrb w11,[x10]
00aed360	b 0x00aed33c
00aed364	add x9,x9,#0x1
00aed368	cmp x9,x22
00aed36c	strb w27,[x8], #0x1
00aed370	b.ne 0x00aed330
00aed374	mov w9,#0xa
00aed378	sturb w9,[x8, #-0x1]
00aed37c	ldr x1,[x19, #0x8]
00aed380	ldr x0,[sp, #0x18]
00aed384	sub x24,x8,x1
00aed388	mov w2,w24
00aed38c	bl 0x00c34240
00aed390	cmp x24,w0, SXTW 
00aed394	b.ne 0x00aed3b0
00aed398	ldp x8,x21,[sp, #0x8]
00aed39c	add x23,x23,#0x1
00aed3a0	add x20,x24,x20
00aed3a4	cmp x23,x8
00aed3a8	b.lt 0x00aed2cc
00aed3ac	b 0x00aed3bc
00aed3b0	mov x20,#-0x1
00aed3b4	b 0x00aed3bc
00aed3b8	mov x20,xzr
00aed3bc	mov x0,x19
00aed3c0	bl 0x00c35660
00aed3c4	mov x0,x20
00aed3c8	ldp x29,x30,[sp, #0x70]
00aed3cc	ldp x20,x19,[sp, #0x60]
00aed3d0	ldp x22,x21,[sp, #0x50]
00aed3d4	ldp x24,x23,[sp, #0x40]
00aed3d8	ldp x26,x25,[sp, #0x30]
00aed3dc	ldp x28,x27,[sp, #0x20]
00aed3e0	add sp,sp,#0x80
00aed3e4	ret
