; cpr::Session::SetAuth @ 008ee344
008ee344	stp x20,x19,[sp, #-0x20]!
008ee348	stp x29,x30,[sp, #0x10]
008ee34c	add x29,sp,#0x10
008ee350	mov x20,x0
008ee354	mov x0,x1
008ee358	mov x19,x1
008ee35c	bl 0x00c30d80
008ee360	cmp w0,#0x2
008ee364	b.eq 0x008ee384
008ee368	cmp w0,#0x1
008ee36c	b.eq 0x008ee394
008ee370	cbnz w0,0x008ee3d0
008ee374	ldr x8,[x20, #0x18]
008ee378	mov w1,#0x6b
008ee37c	mov w2,#0x1
008ee380	b 0x008ee3a0
008ee384	ldr x8,[x20, #0x18]
008ee388	mov w1,#0x6b
008ee38c	mov w2,#0x8
008ee390	b 0x008ee3a0
008ee394	ldr x8,[x20, #0x18]
008ee398	mov w1,#0x6b
008ee39c	mov w2,#0x2
008ee3a0	ldr x0,[x8]
008ee3a4	bl 0x00c317c0
008ee3a8	ldr x8,[x20, #0x18]
008ee3ac	mov x0,x19
008ee3b0	ldr x20,[x8]
008ee3b4	bl 0x00c30d90
008ee3b8	ldp x29,x30,[sp, #0x10]
008ee3bc	mov w1,#0x2715
008ee3c0	mov x2,x0
008ee3c4	mov x0,x20
008ee3c8	ldp x20,x19,[sp], #0x20
008ee3cc	b 0x00c317c0
008ee3d0	ldp x29,x30,[sp, #0x10]
008ee3d4	ldp x20,x19,[sp], #0x20
008ee3d8	ret
