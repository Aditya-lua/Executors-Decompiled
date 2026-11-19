; FUN_007fdaa0 @ 007fdaa0
007fdaa0	stp x29,x30,[sp, #-0x20]!
007fdaa4	str x19,[sp, #0x10]
007fdaa8	mov x29,sp
007fdaac	adrp x8,0xcca000
007fdab0	mov x19,x0
007fdab4	ldr x8,[x8, #0x978]
007fdab8	blr x8
007fdabc	adrp x8,0xcca000
007fdac0	ldr x9,[x8, #0x938]
007fdac4	add x9,x9,#0x29
007fdac8	ldarb w9,[x9]
007fdacc	tbnz w9,#0x0,0x007fdaf0
007fdad0	ldr x9,[x8, #0x938]
007fdad4	ldr x10,[x9, #0x8]
007fdad8	cbnz x10,0x007fdaf0
007fdadc	add x9,x9,#0x28
007fdae0	ldarb w9,[x9]
007fdae4	tbz w9,#0x0,0x007fdaf0
007fdae8	ldr x8,[x8, #0x938]
007fdaec	str x19,[x8, #0x8]
007fdaf0	ldr x19,[sp, #0x10]
007fdaf4	ldp x29,x30,[sp], #0x20
007fdaf8	ret
