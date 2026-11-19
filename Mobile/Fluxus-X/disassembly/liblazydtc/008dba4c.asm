; LZ4_decompress_fast_continue @ 008dba4c
008dba4c	sub sp,sp,#0x70
008dba50	stp x29,x30,[sp, #0x10]
008dba54	stp x28,x27,[sp, #0x20]
008dba58	stp x26,x25,[sp, #0x30]
008dba5c	stp x24,x23,[sp, #0x40]
008dba60	stp x22,x21,[sp, #0x50]
008dba64	stp x20,x19,[sp, #0x60]
008dba68	add x29,sp,#0x10
008dba6c	ldr x4,[x0, #0x18]
008dba70	mov w22,w3
008dba74	mov x21,x2
008dba78	mov x19,x0
008dba7c	cbz x4,0x008dbac4
008dba80	ldr x8,[x19, #0x8]
008dba84	cmp x8,x21
008dba88	b.eq 0x008dbc3c
008dba8c	sub x3,x8,x4
008dba90	mov x0,x1
008dba94	mov x1,x21
008dba98	mov w2,w22
008dba9c	str x4,[x19, #0x10]
008dbaa0	str x3,[x19]
008dbaa4	bl 0x008dbe88
008dbaa8	cmp w0,#0x1
008dbaac	b.lt 0x008dbe3c
008dbab0	sxtw x8,w22
008dbab4	str x8,[x19, #0x18]
008dbab8	add x8,x21,x8
008dbabc	str x8,[x19, #0x8]
008dbac0	b 0x008dbe3c
008dbac4	sxtw x25,w22
008dbac8	mov x20,x1
008dbacc	mov x22,x1
008dbad0	mov x23,x21
008dbad4	add x26,x21,x25
008dbad8	b 0x008dbaec
008dbadc	add x23,x8,x9
008dbae0	sub x8,x26,x23
008dbae4	cmp x8,#0x5
008dbae8	b.cc 0x008dbe38
008dbaec	ldrb w27,[x22], #0x1
008dbaf0	lsr x24,x27,#0x4
008dbaf4	cmp w24,#0xf
008dbaf8	b.ne 0x008dbb14
008dbafc	mov x8,xzr
008dbb00	ldrb w9,[x22], #0x1
008dbb04	cmp x9,#0xff
008dbb08	add x8,x8,x9
008dbb0c	b.eq 0x008dbb00
008dbb10	add x24,x8,#0xf
008dbb14	sub x8,x26,x23
008dbb18	cmp x8,x24
008dbb1c	b.cc 0x008dbe38
008dbb20	mov x0,x23
008dbb24	mov x1,x22
008dbb28	mov x2,x24
008dbb2c	bl 0x00c2ff60
008dbb30	add x8,x23,x24
008dbb34	add x22,x22,x24
008dbb38	sub x11,x26,x8
008dbb3c	cmp x11,#0xb
008dbb40	b.ls 0x008dbe0c
008dbb44	and x10,x27,#0xf
008dbb48	ldrh w13,[x22], #0x2
008dbb4c	cmp w10,#0xf
008dbb50	b.ne 0x008dbb6c
008dbb54	mov x9,xzr
008dbb58	ldrb w10,[x22], #0x1
008dbb5c	cmp x10,#0xff
008dbb60	add x9,x9,x10
008dbb64	b.eq 0x008dbb58
008dbb68	add x10,x9,#0xf
008dbb6c	add x9,x10,#0x4
008dbb70	sub x12,x8,x21
008dbb74	cmp x11,x9
008dbb78	ccmp x12,x13,#0x0,cs
008dbb7c	b.cc 0x008dbe38
008dbb80	cbz x9,0x008dbadc
008dbb84	mov x12,xzr
008dbb88	cmp x9,#0x8
008dbb8c	neg x11,x13
008dbb90	b.cc 0x008dbc18
008dbb94	cmp w13,#0x20
008dbb98	b.cc 0x008dbc18
008dbb9c	cmp x9,#0x20
008dbba0	b.cs 0x008dbbac
008dbba4	mov x12,xzr
008dbba8	b 0x008dbbec
008dbbac	and x12,x9,#-0x20
008dbbb0	add x14,x23,#0x10
008dbbb4	sub x13,x24,x13
008dbbb8	add x13,x14,x13
008dbbbc	add x14,x14,x24
008dbbc0	mov x15,x12
008dbbc4	ldp q0,q1,[x13, #-0x10]
008dbbc8	subs x15,x15,#0x20
008dbbcc	add x13,x13,#0x20
008dbbd0	stp q0,q1,[x14, #-0x10]
008dbbd4	add x14,x14,#0x20
008dbbd8	b.ne 0x008dbbc4
008dbbdc	cmp x9,x12
008dbbe0	b.eq 0x008dbadc
008dbbe4	tst x9,#0x18
008dbbe8	b.eq 0x008dbc18
008dbbec	mov x14,x12
008dbbf0	and x12,x9,#-0x8
008dbbf4	add x13,x14,x24
008dbbf8	sub x14,x14,x12
008dbbfc	add x13,x23,x13
008dbc00	ldr d0,[x13,x11]
008dbc04	adds x14,x14,#0x8
008dbc08	str d0,[x13], #0x8
008dbc0c	b.ne 0x008dbc00
008dbc10	cmp x9,x12
008dbc14	b.eq 0x008dbadc
008dbc18	sub x10,x10,x12
008dbc1c	add x12,x12,x24
008dbc20	add x10,x10,#0x4
008dbc24	add x12,x23,x12
008dbc28	ldrb w13,[x12, x11]
008dbc2c	subs x10,x10,#0x1
008dbc30	strb w13,[x12], #0x1
008dbc34	b.ne 0x008dbc28
008dbc38	b 0x008dbadc
008dbc3c	sxtw x9,w22
008dbc40	ldr x8,[x19]
008dbc44	ldr x27,[x19, #0x10]
008dbc48	sub x28,x21,x4
008dbc4c	mov x22,x1
008dbc50	add x26,x21,x9
008dbc54	add x25,x8,x27
008dbc58	stp x9,x1,[sp]
008dbc5c	b 0x008dbc70
008dbc60	add x21,x21,x23
008dbc64	sub x8,x26,x21
008dbc68	cmp x8,#0x5
008dbc6c	b.cc 0x008dbe38
008dbc70	ldrb w24,[x22], #0x1
008dbc74	lsr x23,x24,#0x4
008dbc78	cmp w23,#0xf
008dbc7c	b.ne 0x008dbc98
008dbc80	mov x8,xzr
008dbc84	ldrb w9,[x22], #0x1
008dbc88	cmp x9,#0xff
008dbc8c	add x8,x8,x9
008dbc90	b.eq 0x008dbc84
008dbc94	add x23,x8,#0xf
008dbc98	sub x8,x26,x21
008dbc9c	cmp x8,x23
008dbca0	b.cc 0x008dbe38
008dbca4	mov x0,x21
008dbca8	mov x1,x22
008dbcac	mov x2,x23
008dbcb0	bl 0x00c2ff60
008dbcb4	add x21,x21,x23
008dbcb8	add x22,x22,x23
008dbcbc	sub x9,x26,x21
008dbcc0	cmp x9,#0xb
008dbcc4	b.ls 0x008dbe2c
008dbcc8	and x10,x24,#0xf
008dbccc	ldrh w8,[x22], #0x2
008dbcd0	cmp w10,#0xf
008dbcd4	b.ne 0x008dbcf0
008dbcd8	mov x10,xzr
008dbcdc	ldrb w11,[x22], #0x1
008dbce0	cmp x11,#0xff
008dbce4	add x10,x10,x11
008dbce8	b.eq 0x008dbcdc
008dbcec	add x10,x10,#0xf
008dbcf0	add x23,x10,#0x4
008dbcf4	cmp x9,x23
008dbcf8	b.cc 0x008dbe38
008dbcfc	sub x9,x21,x28
008dbd00	add x10,x9,x27
008dbd04	cmp x10,x8
008dbd08	b.cc 0x008dbe38
008dbd0c	subs x9,x9,x8
008dbd10	b.cs 0x008dbd38
008dbd14	add x1,x25,x9
008dbd18	mov x0,x21
008dbd1c	sub x24,x25,x1
008dbd20	subs x20,x23,x24
008dbd24	b.cs 0x008dbd44
008dbd28	mov x2,x23
008dbd2c	bl 0x00c2ff60
008dbd30	mov x20,xzr
008dbd34	b 0x008dbd50
008dbd38	sub x8,x21,x8
008dbd3c	cbnz x23,0x008dbd60
008dbd40	b 0x008dbc60
008dbd44	mov x2,x24
008dbd48	bl 0x00c2ff60
008dbd4c	mov x23,x24
008dbd50	add x21,x21,x23
008dbd54	mov x23,x20
008dbd58	mov x8,x28
008dbd5c	cbz x23,0x008dbc60
008dbd60	cmp x23,#0x8
008dbd64	mov x9,xzr
008dbd68	b.cc 0x008dbdec
008dbd6c	sub x10,x21,x8
008dbd70	cmp x10,#0x20
008dbd74	b.cc 0x008dbdec
008dbd78	cmp x23,#0x20
008dbd7c	b.cs 0x008dbd88
008dbd80	mov x9,xzr
008dbd84	b 0x008dbdc0
008dbd88	and x9,x23,#-0x20
008dbd8c	add x10,x8,#0x10
008dbd90	add x11,x21,#0x10
008dbd94	mov x12,x9
008dbd98	ldp q0,q1,[x10, #-0x10]
008dbd9c	subs x12,x12,#0x20
008dbda0	add x10,x10,#0x20
008dbda4	stp q0,q1,[x11, #-0x10]
008dbda8	add x11,x11,#0x20
008dbdac	b.ne 0x008dbd98
008dbdb0	cmp x23,x9
008dbdb4	b.eq 0x008dbc60
008dbdb8	tst x23,#0x18
008dbdbc	b.eq 0x008dbdec
008dbdc0	mov x12,x9
008dbdc4	and x9,x23,#-0x8
008dbdc8	add x10,x8,x12
008dbdcc	add x11,x21,x12
008dbdd0	sub x12,x12,x9
008dbdd4	ldr d0,[x10], #0x8
008dbdd8	adds x12,x12,#0x8
008dbddc	str d0,[x11], #0x8
008dbde0	b.ne 0x008dbdd4
008dbde4	cmp x23,x9
008dbde8	b.eq 0x008dbc60
008dbdec	add x8,x8,x9
008dbdf0	add x10,x21,x9
008dbdf4	sub x9,x23,x9
008dbdf8	ldrb w11,[x8], #0x1
008dbdfc	subs x9,x9,#0x1
008dbe00	strb w11,[x10], #0x1
008dbe04	b.ne 0x008dbdf8
008dbe08	b 0x008dbc60
008dbe0c	cmp x8,x26
008dbe10	b.ne 0x008dbe38
008dbe14	sub w0,w22,w20
008dbe18	cmp w0,#0x1
008dbe1c	b.lt 0x008dbe3c
008dbe20	str x25,[x19, #0x18]
008dbe24	str x26,[x19, #0x8]
008dbe28	b 0x008dbe3c
008dbe2c	ldr x8,[sp, #0x8]
008dbe30	cmp x21,x26
008dbe34	b.eq 0x008dbe5c
008dbe38	mov w0,#0xffffffff
008dbe3c	ldp x20,x19,[sp, #0x60]
008dbe40	ldp x22,x21,[sp, #0x50]
008dbe44	ldp x24,x23,[sp, #0x40]
008dbe48	ldp x26,x25,[sp, #0x30]
008dbe4c	ldp x28,x27,[sp, #0x20]
008dbe50	ldp x29,x30,[sp, #0x10]
008dbe54	add sp,sp,#0x70
008dbe58	ret
008dbe5c	sub w0,w22,w8
008dbe60	cmp w0,#0x1
008dbe64	b.lt 0x008dbe3c
008dbe68	ldr x8,[x19, #0x18]
008dbe6c	ldr x9,[x19, #0x8]
008dbe70	ldr x10,[sp]
008dbe74	add x8,x8,x10
008dbe78	add x9,x9,x10
008dbe7c	str x8,[x19, #0x18]
008dbe80	str x9,[x19, #0x8]
008dbe84	b 0x008dbe3c
