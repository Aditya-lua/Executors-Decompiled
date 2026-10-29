/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc51fac..0xc520cc (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c51fac_0 {
    void* field_0;
    unsigned long long field_8;
} st_c51fac_0;


void* sub_c51fac(void* a0, st_c51fac_0 *a1, unsigned long long a2)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4120
    unsigned long v10;  // x10
    void* v11;  // x9
    unsigned long long v2;  // 4122
    unsigned long long v3;  // w10
    void* v4;  // x8
    unsigned long v5;  // x10
    void* v6;  // x9
    unsigned long v7;  // x10
    void* v8;  // x9
    unsigned long v9;  // x9

    v0 = (unsigned int)a2 - 1;
    if ((((unsigned int)a2 ^ (unsigned int)v0) & 0xff) <= ((unsigned int)v0 & 0xff))
    {
        *(unsigned long long *)a0 = (26 | (a2 * 0x100 | a2 >> 56) & 0xff00) & 0xffff;
        *(unsigned long long *)&a0[8] = v0;
        return a0;
    }
    v1 = ((a2 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | a2 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
    v2 = (((a2 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | a2 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
    v0 = ((((((((v2 | v1) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v2 | v1) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v2 | v1) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v2 | v1) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v2 | v1) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v2 | v1) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v2 | v1) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v2 | v1) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    if (!((v0 & 0xffffffff) * 0x100000000))
        v3 = 32;
    else
        v3 = (unsigned int)Clz((v0 & 0xffffffff) * 0x100000000);
    if (1 >= v3)
    {
        if (!v3)
        {
            v4 = a1->field_0;
            v7 = a1->field_8;
            if (v7)
            {
                v8 = *(char *)v4;
                a1->field_0 = v4 + 1;
                a1->field_8 = v7 - 1;
                *(void* *)&a0[8] = v8;
                *(char *)a0 = 82;
                return a0;
            }
        }
        else if (v3 == 1)
        {
            v4 = a1->field_0;
            v5 = a1->field_8;
            if (v5 > 1)
            {
                v6 = *(short *)v4;
                a1->field_0 = v4 + 2;
                a1->field_8 = v5 - 2;
                *(void* *)&a0[8] = v6;
                *(char *)a0 = 82;
                return a0;
            }
        }
        else
        {
            *(unsigned long long *)a0 = (26 | (a2 * 0x100 | a2 >> 56) & 0xff00) & 0xffff;
            *(unsigned long long *)&a0[8] = v0;
            return a0;
        }
    }
    else
    {
        if (v3 == 2)
        {
            v4 = a1->field_0;
            v10 = a1->field_8;
            if (v10 > 3)
            {
                v11 = *(int *)v4;
                a1->field_0 = v4 + 4;
                a1->field_8 = v10 - 4;
                *(void* *)&a0[8] = v11;
                *(char *)a0 = 82;
                return a0;
            }
        }
        else if (v3 != 3)
        {
            *(unsigned long long *)a0 = (26 | (a2 * 0x100 | a2 >> 56) & 0xff00) & 0xffff;
            *(unsigned long long *)&a0[8] = v0;
            return a0;
        }
        else
        {
            v4 = a1->field_0;
            v9 = a1->field_8;
            if (a1->field_8 >= 8)
            {
                a1->field_0 = v4 + 8;
                a1->field_8 = v9 - 8;
                *(unsigned long long *)&a0[8] = (char)v4[7] * 0x100000000000000 | (*(int *)v4 * 0x100 | ((short)v4[4] | (char)v4[6] * 0x10000) * 0x10000000000) >> 8;
                *(char *)a0 = 82;
                return a0;
            }
        }
    }
    *(unsigned long long *)a0 = 19;
    *(void* *)&a0[8] = v4;
    return a0;
}
