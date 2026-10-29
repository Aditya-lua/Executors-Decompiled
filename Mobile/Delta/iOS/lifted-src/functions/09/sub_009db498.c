/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9db498..0x9db58c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9db498_0 {
    long long field_0;
    unsigned long long field_8;
} st_9db498_0;

typedef struct st_9db498_1 {
    long long field_0;
    int field_8;
} st_9db498_1;


int sub_9db498(void* a0, st_9db498_0 *a1, st_9db498_1 *a2)
{
    unsigned long long v2;  // w20
    unsigned long v3;  // x21
    unsigned long long v12;  // 4113
    unsigned long long *v13;  // x8
    unsigned long long v14;  // w20
    unsigned long long *v15;  // x8
    unsigned long long v4;  // 4161
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    void* iter;  // x8
    void* node;  // x9
    unsigned int v9;  // w10
    unsigned long v10;  // x11
    unsigned int v11;  // w10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (int)a1->field_8;
    v3 = a2->field_8;
    v4 = arm64g_calculate_condition(67, v2, v3 & 0xffffffff, 0);
    if (!(v4 & 1))
    {
        v5 = sub_9e4cdc();
        if (v5)
        {
            v2 = v2;
            if (v2)
            {
                v6 = sub_9dbbc8(*(long long *)a0, a1->field_0, a2->field_0, v3);
                iter = *(long long *)a0 + v3 * 8;
                if ((unsigned int)(v2 - v3))
                {
                    node = a1->field_0 + v3 * 8;
                    v9 = v3 - v2;
                    do
                    {
                        v10 = *(long long *)node;
                        node += 8;
                        *(unsigned long long *)iter = v10 - v6;
                        iter += 8;
                        if (!v10)
                            v6 &= 1;
                        else
                            v6 = 0;
                    } while ((v11 = v9 + 1, v12 = arm64g_calculate_condition(49, v9, 1, 0), v9 += 1, v12 & 1));
                }
                v13 = iter - 8;
                do
                {
                    v14 = v2;
                    v15 = (char *)v13 - 8;
                } while (!*v13 && (v2 = v14 - 1, v13 = v15, v14 != 1));
            }
            *(unsigned int *)&a0[8] = v2;
            *(unsigned int *)&a0[16] = 0;
            v5 = 1;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_add.c", 142, "BN_usub");
        sub_a36abc(3, 100, 0);
        v5 = 0;
    }
    return v5;
}
