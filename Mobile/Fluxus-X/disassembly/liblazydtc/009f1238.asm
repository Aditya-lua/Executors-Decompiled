; ASN1_STRING_set0 @ 009f1238
009f1238	str x21,[sp, #-0x30]!
009f123c	stp x20,x19,[sp, #0x10]
009f1240	stp x29,x30,[sp, #0x20]
009f1244	mov x20,x0
009f1248	ldr x0,[x0, #0x8]
009f124c	mov x21,x1
009f1250	adrp x1,0x2c7000
009f1254	mov w19,w2
009f1258	add x1,x1,#0x722
009f125c	mov w2,#0x150
009f1260	add x29,sp,#0x20
009f1264	bl 0x00c32310
009f1268	str x21,[x20, #0x8]
009f126c	str w19,[x20]
009f1270	ldp x29,x30,[sp, #0x20]
009f1274	ldp x20,x19,[sp, #0x10]
009f1278	ldr x21,[sp], #0x30
009f127c	ret
