; OBJ_cmp @ 00aaf360
00aaf360	ldrsw x2,[x0, #0x14]
00aaf364	ldr w8,[x1, #0x14]
00aaf368	subs w8,w2,w8
00aaf36c	b.eq 0x00aaf378
00aaf370	mov w0,w8
00aaf374	ret
00aaf378	ldr x0,[x0, #0x18]
00aaf37c	ldr x1,[x1, #0x18]
00aaf380	b 0x00c300b0
