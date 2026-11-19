; FUN_009afe44 @ 009afe44
009afe44	str x21,[sp, #-0x30]!
009afe48	stp x20,x19,[sp, #0x10]
009afe4c	stp x29,x30,[sp, #0x20]
009afe50	ldr x8,[x0]
009afe54	mov x19,x0
009afe58	mov x20,x1
009afe5c	mov w21,wzr
009afe60	add x29,sp,#0x20
009afe64	cbz x8,0x009afe88
009afe68	ldr w9,[x8, #0x8]
009afe6c	cbz w9,0x009afe80
009afe70	ldr x9,[x8]
009afe74	ldr w9,[x9, #0x44]
009afe78	cmp w9,w21
009afe7c	csel w21,w9,w21,gt
009afe80	ldr x8,[x8, #0x10]
009afe84	cbnz x8,0x009afe68
009afe88	add w8,w21,#0x1
009afe8c	adrp x1,0x2af000
009afe90	sbfiz x0,x8,#0x2,#0x20
009afe94	add x1,x1,#0x931
009afe98	mov w2,#0x3c7
009afe9c	bl 0x00c34250
009afea0	cbz x0,0x009aff98
009afea4	ldr x8,[x19]
009afea8	cbz x8,0x009afed4
009afeac	ldr w9,[x8, #0x8]
009afeb0	cbz w9,0x009afecc
009afeb4	ldr x9,[x8]
009afeb8	ldrsw x9,[x9, #0x44]
009afebc	lsl x9,x9,#0x2
009afec0	ldr w10,[x0, x9#0x0]
009afec4	add w10,w10,#0x1
009afec8	str w10,[x0, x9#0x0]
009afecc	ldr x8,[x8, #0x10]
009afed0	cbnz x8,0x009afeac
009afed4	tbnz w21,#0x1f,0x009aff80
009afed8	sxtw x8,w21
009afedc	ldr w9,[x0, x8, LSL #0x2]
009afee0	cmp w9,#0x1
009afee4	b.lt 0x009aff74
009afee8	ldr x9,[x19]
009afeec	ldr x10,[x20]
009afef0	cbz x9,0x009aff68
009afef4	cbz x10,0x009aff68
009afef8	mov x12,x9
009afefc	mov x11,x10
009aff00	ldr x13,[x12]
009aff04	ldr w14,[x13, #0x44]
009aff08	ldr x13,[x12, #0x10]
009aff0c	cmp x8,x14
009aff10	b.ne 0x009aff54
009aff14	ldr w14,[x12, #0x8]
009aff18	cbz w14,0x009aff54
009aff1c	cmp x12,x11
009aff20	b.eq 0x009aff54
009aff24	ldr x14,[x12, #0x18]
009aff28	cmp x12,x9
009aff2c	csel x9,x13,x9,eq
009aff30	mov x15,x13
009aff34	cbz x14,0x009aff40
009aff38	str x13,[x14, #0x10]
009aff3c	ldr x15,[x12, #0x10]
009aff40	cbz x15,0x009aff48
009aff44	str x14,[x15, #0x18]
009aff48	str x12,[x11, #0x10]
009aff4c	stp xzr,x11,[x12, #0x10]
009aff50	mov x11,x12
009aff54	cmp x12,x10
009aff58	b.eq 0x009aff6c
009aff5c	mov x12,x13
009aff60	cbnz x13,0x009aff00
009aff64	b 0x009aff6c
009aff68	mov x11,x10
009aff6c	str x9,[x19]
009aff70	str x11,[x20]
009aff74	cmp x8,#0x0
009aff78	sub x8,x8,#0x1
009aff7c	b.gt 0x009afedc
009aff80	adrp x1,0x2af000
009aff84	add x1,x1,#0x931
009aff88	mov w2,#0x3df
009aff8c	bl 0x00c32310
009aff90	mov w0,#0x1
009aff94	b 0x009affcc
009aff98	bl 0x00c342a0
009aff9c	adrp x0,0x2af000
009affa0	adrp x2,0x2c7000
009affa4	add x0,x0,#0x931
009affa8	add x2,x2,#0x4f1
009affac	mov w1,#0x3c9
009affb0	bl 0x00c342b0
009affb4	mov w1,#0x100
009affb8	mov w0,#0x14
009affbc	movk w1,#0xc, LSL #16
009affc0	mov x2,xzr
009affc4	bl 0x00c342c0
009affc8	mov w0,wzr
009affcc	ldp x29,x30,[sp, #0x20]
009affd0	ldp x20,x19,[sp, #0x10]
009affd4	ldr x21,[sp], #0x30
009affd8	ret
