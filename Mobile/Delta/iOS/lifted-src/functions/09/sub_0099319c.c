/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99319c..0x9932ec (336 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99319c_2 {
    char padding_0[104];
    unsigned int field_68;
    char padding_6c[3076];
    struct st_99319c_0 *field_c70;
} st_99319c_2;

typedef struct st_99319c_1 {
    unsigned long long field_0;
} st_99319c_1;

typedef struct st_99319c_0 {
    char padding_0[80];
    struct st_99319c_1 *field_50;
} st_99319c_0;


unsigned long long sub_99319c(st_99319c_2 *a0, unsigned int a1, unsigned int a2, long long a3, long long a4)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    unsigned long long v12;  // 4145
    unsigned long long v13;  // 4112
    unsigned int v14;  // w8
    unsigned int v15;  // w8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (a2)
    {
        v0 = v7;
        v1 = v8;
        v2 = v9;
        v3 = v10;
        v4 = &v6;
        v5 = v11;
        a0->field_68 = 1;
        v12 = arm64g_calculate_condition(1, a2, 2, 0);
        if (!(v12 & 1))
        {
            v13 = arm64g_calculate_condition(0x11, a2, 3, 0);
            if (!(v13 & 1))
            {
                if (a1)
                {
                    sub_a368c8();
                    sub_a369bc(a3, a4, 0);
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    a2 = 0xfffffffe;
                }
                else if ((char)a0->padding_6c[2372] >= 0)
                {
                    sub_a368c8();
                    sub_a369bc(a3, a4, 0);
                    sub_9a58a4(a0, 50, 294, 0);
                    a2 = 0xfffffffd;
                }
                else
                {
                    sub_962a1c();
                    *(unsigned int *)&a0->padding_6c[336] = 0;
                    a2 = 0xfffffffd;
                }
            }
            if (0 <= (int)a2)
                v14 = a2;
            else
                v14 = 0xffffffff;
            if (~a2 & 0xfffffffd)
                return v14;
            return 0;
        }
        a0->field_c70->field_50();
    }
    else
    {
        if (a1)
            v15 = 2;
        else
            v15 = 3;
        a0->field_68 = v15;
        return 0xffffffff;
    }
}
