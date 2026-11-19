; ASN1_UTCTIME_cmp_time_t @ 009eff8c
009eff8c	sub sp,sp,#0x90
009eff90	stp x29,x30,[sp, #0x80]
009eff94	add x29,sp,#0x80
009eff98	stur x1,[x29, #-0x8]
009eff9c	ldr w9,[x0, #0x4]
009effa0	cmp w9,#0x17
009effa4	b.ne 0x009f000c
009effa8	mov x8,x0
009effac	add x0,sp,#0x40
009effb0	mov x1,x8
009effb4	bl 0x00c379e0
009effb8	cbz w0,0x009f000c
009effbc	sub x0,x29,#0x8
009effc0	add x1,sp,#0x8
009effc4	bl 0x00c37980
009effc8	cbz x0,0x009f000c
009effcc	add x0,sp,#0x4
009effd0	mov x1,sp
009effd4	add x2,sp,#0x8
009effd8	add x3,sp,#0x40
009effdc	bl 0x00c379a0
009effe0	cbz w0,0x009f000c
009effe4	ldr w8,[sp, #0x4]
009effe8	mov w0,#0x1
009effec	cmp w8,#0x0
009efff0	b.gt 0x009f0010
009efff4	ldr w9,[sp]
009efff8	cmp w9,#0x0
009efffc	b.gt 0x009f0010
009f0000	orr w8,w9,w8
009f0004	asr w0,w8,#0x1f
009f0008	b 0x009f0010
009f000c	orr w0,wzr,#0xfffffffe
009f0010	ldp x29,x30,[sp, #0x80]
009f0014	add sp,sp,#0x90
009f0018	ret
