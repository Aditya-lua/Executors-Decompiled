; X509_NAME_add_entry_by_OBJ @ 00b14ee8
00b14ee8	stp x22,x21,[sp, #-0x30]!
00b14eec	mov x21,x0
00b14ef0	mov x0,xzr
00b14ef4	stp x20,x19,[sp, #0x10]
00b14ef8	stp x29,x30,[sp, #0x20]
00b14efc	add x29,sp,#0x20
00b14f00	mov w19,w6
00b14f04	mov w20,w5
00b14f08	bl 0x00b14f48
00b14f0c	cbz x0,0x00b14f38
00b14f10	mov x22,x0
00b14f14	mov x0,x21
00b14f18	mov x1,x22
00b14f1c	mov w2,w20
00b14f20	mov w3,w19
00b14f24	bl 0x00b15038
00b14f28	mov w19,w0
00b14f2c	mov x0,x22
00b14f30	bl 0x00c40940
00b14f34	mov w0,w19
00b14f38	ldp x29,x30,[sp, #0x20]
00b14f3c	ldp x20,x19,[sp, #0x10]
00b14f40	ldp x22,x21,[sp], #0x30
00b14f44	ret
