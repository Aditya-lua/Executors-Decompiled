/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d8904..0x9d8a38 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d8904_1 {
    void* field_0;
    void* field_8;
} st_9d8904_1;

typedef struct st_9d8904_0 {
    char padding_0[40];
    unsigned int field_28;
    char padding_2c[5];
    char field_31;
    char padding_32[14];
    struct st_9d8904_1 *field_40;
} st_9d8904_0;


unsigned long long sub_9d8904(st_9d8904_0 *a0, char a1, unsigned long long a2)
{
    void* *v2;  // x21
    unsigned long v3;  // x22
    void* *v4;  // x23
    void* v5;  // x8
    void* v6;  // x9
    void* v7;  // x8
    void* v8;  // x8
    uint128_t v9;  // q0
    long long v10;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a0->field_31 >> 1 & 1))
    {
        v2 = &a0->field_40->field_0;
        sub_9d3d58();
        if (!(unsigned int)a2)
            return a2;
        if (a1)
        {
            v3 = *(long long *)v2[1];
            if (a0->field_28)
            {
                v4 = &a0->field_40->field_0;
                if (v4)
                {
                    v5 = v4[1];
                    if ((long long)v5[8] != (long long)(*v4)[8])
                    {
                        _memmove((long long)(*v4)[8], (long long)v5[8], *(long long *)v5);
                        v6 = *v4;
                        v7 = v4[1];
                        *(long long *)v6 = *(long long *)v7;
                        *(long long *)&v7[8] = (long long)v6[8];
                    }
                }
            }
            if (sub_9ebee0(*v2, v3 + a2))
            {
                _memcpy((long long)(*v2)[8] + (int)v3, a1, (int)a2);
                v8 = v2[1];
                v9 = (int128_t)(*v2)[16];
                *(int128_t *)v8 = *(int128_t *)*v2;
                *(uint128_t *)&v8[16] = v9;
                return a2;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/bio/bss_mem.c", 228, "mem_write");
            v10 = 786690;
LABEL_9d89e8:
            sub_a36abc(32, v10, 0);
        }
        return 0xffffffff;
    }
    sub_a368c8();
    sub_a369bc("crypto/bio/bss_mem.c", 0xdd, "mem_write");
    v10 = 126;
    goto LABEL_9d89e8;
}
