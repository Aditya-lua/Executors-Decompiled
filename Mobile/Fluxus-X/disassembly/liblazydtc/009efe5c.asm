; ASN1_UTCTIME_set_string @ 009efe5c
009efe5c	sub sp,sp,#0x40
009efe60	stp x20,x19,[sp, #0x20]
009efe64	mov x19,x0
009efe68	mov w8,#0x17
009efe6c	mov x0,x1
009efe70	stp x29,x30,[sp, #0x30]
009efe74	add x29,sp,#0x30
009efe78	mov x20,x1
009efe7c	str w8,[sp, #0xc]
009efe80	bl 0x00c2ff50
009efe84	str w0,[sp, #0x8]
009efe88	add x1,sp,#0x8
009efe8c	mov x0,xzr
009efe90	stp x20,xzr,[sp, #0x10]
009efe94	bl 0x00c379e0
009efe98	cbz w0,0x009efeb4
009efe9c	cbz x19,0x009efeb0
009efea0	add x1,sp,#0x8
009efea4	mov x0,x19
009efea8	bl 0x00c37940
009efeac	cbz w0,0x009efeb4
009efeb0	mov w0,#0x1
009efeb4	ldp x29,x30,[sp, #0x30]
009efeb8	ldp x20,x19,[sp, #0x20]
009efebc	add sp,sp,#0x40
009efec0	ret
