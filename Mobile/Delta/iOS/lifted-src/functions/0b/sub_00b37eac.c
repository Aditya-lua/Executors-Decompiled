/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb37eac..0xb380ec (576 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b37eac_0 {
    char padding_0[8];
    long long field_8;
} st_b37eac_0;


unsigned long long sub_b37eac(st_b37eac_0 *a0, unsigned long long a1, unsigned long long a2, long long a3, unsigned long a4)
{
    unsigned long long v2;  // x0
    unsigned long v3;  // x8
    long long v4;  // x0
    unsigned long long v5;  // x1
    unsigned long long v6;  // x26
    unsigned long long v7;  // x25
    unsigned long long v8;  // x24
    unsigned long long v9;  // w0
    unsigned long long v10;  // x27
    unsigned long long v11;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a2f9e0();
    if (!(unsigned int)v2)
    {
        return v2;
    }
    else if (*(int *)&a0[1].padding_0[0])
    {
        return 0xfffffffe;
    }
    else
    {
        v3 = sub_aafbcc(a0->field_8);
        if (!a1)
        {
            if ((unsigned int)v3)
            {
                *(unsigned long *)a2 = v3;
                return 1;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/rsa_kem.c", 379, "rsasve_recover");
            v4 = 57;
            v5 = 158;
        }
        else if (v3 != a4)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/rsa_kem.c", 391, "rsasve_recover");
            v4 = 57;
            v5 = 142;
        }
        else if (a2 && a4 > (unsigned long long)*(long long *)a2)
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/rsa_kem.c", 401, "rsasve_recover");
            v4 = 57;
            v5 = 217;
        }
        else
        {
            v6 = sub_962b90(a0->field_8);
            v7 = sub_9e4958(v6);
            v8 = sub_9e4958(v7);
            if (!v6 || !v7 || !v8 || !sub_9e4db0(a3, a4, v7) || !sub_9e4c34(v8, v6) || !sub_9ebaf8(v8, 1))
            {
                sub_9e48d4(v7);
                sub_9e48d4(v8);
                return 0;
            }
            if ((int)sub_9e53a8(v7, sub_9e4624()) >= 1)
            {
                v9 = (unsigned int)sub_9e53a8(v7, v8);
                v10 = v9 >> 31;
                if (v9 < 0)
                    v5 = 0;
                else
                    v5 = 132;
            }
            else
            {
                v10 = 0;
                v5 = 111;
            }
            sub_9e48d4(v7);
            sub_9e48d4(v8);
            if (v10 & 1)
            {
                v11 = (unsigned int)sub_aafc0c(a4, a3, a1, a0->field_8, 3);
                if (!a2 || v11 < 1)
                    return v11 > 0;
                *(unsigned long long *)a2 = v11;
                return v11 > 0;
            }
            sub_a368c8();
            sub_a369bc("providers/implementations/kem/rsa_kem.c", 437, "rsasve_recover");
            v4 = 4;
        }
        sub_a36abc(v4, v5, 0);
        return 0;
    }
}
