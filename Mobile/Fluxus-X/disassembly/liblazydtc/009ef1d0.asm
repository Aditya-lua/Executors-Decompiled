; ASN1_TIME_diff @ 009ef1d0
009ef1d0	sub sp,sp,#0xa0
009ef1d4	str x21,[sp, #0x70]
009ef1d8	stp x20,x19,[sp, #0x80]
009ef1dc	mov x21,x3
009ef1e0	mov x19,x1
009ef1e4	mov x20,x0
009ef1e8	stp x29,x30,[sp, #0x90]
009ef1ec	add x29,sp,#0x90
009ef1f0	cbz x2,0x009ef21c
009ef1f4	add x0,sp,#0x38
009ef1f8	mov x1,x2
009ef1fc	bl 0x009ee624
009ef200	cbz w0,0x009ef294
009ef204	cbz x21,0x009ef250
009ef208	mov x0,sp
009ef20c	mov x1,x21
009ef210	bl 0x009ee624
009ef214	cbnz w0,0x009ef280
009ef218	b 0x009ef294
009ef21c	mov x0,sp
009ef220	bl 0x00c30970
009ef224	mov x0,sp
009ef228	add x1,sp,#0x38
009ef22c	stp xzr,xzr,[sp, #0x60]
009ef230	stp xzr,xzr,[sp, #0x50]
009ef234	stp xzr,xzr,[sp, #0x40]
009ef238	str xzr,[sp, #0x38]
009ef23c	bl 0x00c37980
009ef240	cmp x0,#0x0
009ef244	cset w0,ne
009ef248	cbnz w0,0x009ef204
009ef24c	b 0x009ef294
009ef250	sub x0,x29,#0x18
009ef254	bl 0x00c30970
009ef258	sub x0,x29,#0x18
009ef25c	mov x1,sp
009ef260	stp xzr,xzr,[sp, #0x28]
009ef264	stp xzr,xzr,[sp, #0x18]
009ef268	stp xzr,xzr,[sp, #0x8]
009ef26c	str xzr,[sp]
009ef270	bl 0x00c37980
009ef274	cmp x0,#0x0
009ef278	cset w0,ne
009ef27c	cbz w0,0x009ef294
009ef280	add x2,sp,#0x38
009ef284	mov x3,sp
009ef288	mov x0,x20
009ef28c	mov x1,x19
009ef290	bl 0x00c379a0
009ef294	ldp x29,x30,[sp, #0x90]
009ef298	ldp x20,x19,[sp, #0x80]
009ef29c	ldr x21,[sp, #0x70]
009ef2a0	add sp,sp,#0xa0
009ef2a4	ret
