; FUN_00b514bc @ 00b514bc
00b514bc	stp x20,x19,[sp, #-0x20]!
00b514c0	stp x29,x30,[sp, #0x10]
00b514c4	add x29,sp,#0x10
00b514c8	cbz x0,0x00b51500
00b514cc	mov x19,x1
00b514d0	adrp x1,0x2a3000
00b514d4	mov x20,x0
00b514d8	add x1,x1,#0xe83
00b514dc	mov x0,x19
00b514e0	bl 0x00c36530
00b514e4	cbz x0,0x00b514fc
00b514e8	ldp x29,x30,[sp, #0x10]
00b514ec	mov x0,x20
00b514f0	mov x1,x19
00b514f4	ldp x20,x19,[sp], #0x20
00b514f8	b 0x00b51d34
00b514fc	mov w0,#0x1
00b51500	ldp x29,x30,[sp, #0x10]
00b51504	ldp x20,x19,[sp], #0x20
00b51508	ret
