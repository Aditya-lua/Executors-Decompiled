; FUN_00b9d008 @ 00b9d008
00b9d008	str x21,[sp, #-0x30]!
00b9d00c	stp x20,x19,[sp, #0x10]
00b9d010	stp x29,x30,[sp, #0x20]
00b9d014	add x29,sp,#0x20
00b9d018	adrp x20,0xd26000
00b9d01c	ldr x21,[x20, #0x20]
00b9d020	mov x8,x1
00b9d024	mov x19,x2
00b9d028	add x1,x0,x21
00b9d02c	mov x0,x8
00b9d030	bl 0x00c2ffd0
00b9d034	add x8,x21,x19
00b9d038	str x8,[x20, #0x20]
00b9d03c	ldp x29,x30,[sp, #0x20]
00b9d040	ldp x20,x19,[sp, #0x10]
00b9d044	mov w0,wzr
00b9d048	ldr x21,[sp], #0x30
00b9d04c	ret
