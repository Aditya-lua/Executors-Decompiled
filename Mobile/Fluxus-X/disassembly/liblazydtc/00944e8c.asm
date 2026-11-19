; FUN_00944e8c @ 00944e8c
00944e8c	sub sp,sp,#0xb0
00944e90	str x23,[sp, #0x70]
00944e94	stp x22,x21,[sp, #0x80]
00944e98	stp x20,x19,[sp, #0x90]
00944e9c	stp x29,x30,[sp, #0xa0]
00944ea0	add x29,sp,#0xa0
00944ea4	mrs x23,tpidr_el0
00944ea8	ldr x8,[x23, #0x28]
00944eac	mov x19,x0
00944eb0	add x0,sp,#0x8
00944eb4	mov x22,x2
00944eb8	mov x21,x1
00944ebc	stur x8,[x29, #-0x38]
00944ec0	bl 0x00c32010
00944ec4	cmp w0,#0x0
00944ec8	mov w8,#0x1b
00944ecc	csel w20,w8,wzr,eq
00944ed0	cbz w0,0x00944ef8
00944ed4	mov x0,x22
00944ed8	bl 0x00963a64
00944edc	mov w2,w0
00944ee0	add x0,sp,#0x8
00944ee4	mov x1,x21
00944ee8	bl 0x00c32020
00944eec	add x1,sp,#0x8
00944ef0	mov x0,x19
00944ef4	bl 0x00c32000
00944ef8	ldr x8,[x23, #0x28]
00944efc	ldur x9,[x29, #-0x38]
00944f00	cmp x8,x9
00944f04	b.ne 0x00944f24
00944f08	mov w0,w20
00944f0c	ldp x29,x30,[sp, #0xa0]
00944f10	ldp x20,x19,[sp, #0x90]
00944f14	ldp x22,x21,[sp, #0x80]
00944f18	ldr x23,[sp, #0x70]
00944f1c	add sp,sp,#0xb0
00944f20	ret
00944f24	bl 0x00c2fec0
