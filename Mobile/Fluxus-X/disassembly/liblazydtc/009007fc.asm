; cpr::util::writeFileFunction @ 009007fc
009007fc	str x19,[sp, #-0x20]!
00900800	stp x29,x30,[sp, #0x10]
00900804	add x29,sp,#0x10
00900808	mov x8,x0
0090080c	mul x19,x2,x1
00900810	mov x0,x3
00900814	mov x1,x8
00900818	mov x2,x19
0090081c	bl 0x00c303e0
00900820	ldp x29,x30,[sp, #0x10]
00900824	mov x0,x19
00900828	ldr x19,[sp], #0x20
0090082c	ret
