; FUN_009bb004 @ 009bb004
009bb004	stp x20,x19,[sp, #-0x20]!
009bb008	mov x20,x0
009bb00c	mov x0,x1
009bb010	stp x29,x30,[sp, #0x10]
009bb014	add x29,sp,#0x10
009bb018	bl 0x00c308a0
009bb01c	mov w19,w0
009bb020	tbnz w0,#0x1f,0x009bb050
009bb024	ldr x0,[x20, #0x18]
009bb028	cbz x0,0x009bb034
009bb02c	sxtw x1,w19
009bb030	bl 0x00c359c0
009bb034	ldr x8,[x20, #0x20]
009bb038	cbz x8,0x009bb054
009bb03c	ldp x29,x30,[sp, #0x10]
009bb040	sxtw x1,w19
009bb044	mov x0,x8
009bb048	ldp x20,x19,[sp], #0x20
009bb04c	b 0x00c35ac0
009bb050	mov w0,wzr
009bb054	ldp x29,x30,[sp, #0x10]
009bb058	ldp x20,x19,[sp], #0x20
009bb05c	ret
