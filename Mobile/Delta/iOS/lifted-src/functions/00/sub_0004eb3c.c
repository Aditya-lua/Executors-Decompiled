/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4eb3c..0x4ed4c (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4eb3c_1 {
    unsigned long long field_0;
} st_4eb3c_1;

typedef struct st_4eb3c_2 {
    struct st_4eb3c_1 *field_0;
} st_4eb3c_2;

typedef struct st_4eb3c_0 {
    char field_0;
} st_4eb3c_0;

extern unsigned long long g_e68218;
extern char g_10002b0;

void sub_4eb3c(st_4eb3c_2 **a0, long long a1, unsigned long a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    unsigned long long v25;  // x30
    st_4eb3c_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_4eb3c_0 *v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    char v6;  // [bp-0x80]
    unsigned long v7;  // [bp-0x58]
    unsigned long v8;  // [bp-0x50]
    unsigned long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = v22;
    v14 = v23;
    v15 = v24;
    v16 = &v18;
    v17 = v25;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v2 = 0;
    v0 = &v1;
    v3 = &g_e68218;
    v4 = a3;
    v5 = a4;
    sub_17ef4(&v6, &v2, 0);
    v7 = 0;
    v8 = 0;
    if (a2)
    {
        sub_4fbd0(&v6, a1);
        *(unsigned long long *)(sub_12484(&v6, a1) + 8) = 0xff00;
        if (a2 != 1)
        {
            sub_4fbd0(&v6, a1 + 8);
            *(unsigned long *)(sub_12484(&v6, a1 + 8) + 8) = 0xff0000;
            if (a2 != 2)
            {
                sub_4fbd0(&v6, a1 + 16);
                *(unsigned long *)(sub_12484(&v6, a1 + 16) + 8) = 0xff000000;
                if (a2 != 3)
                {
                    sub_4fbd0(&v6, a1 + 24);
                    *(unsigned long *)(sub_12484(&v6, a1 + 24) + 8) = 0xff00000000;
                    if (a2 != 4)
                    {
                        sub_4fbd0(&v6, a1 + 32);
                        *(unsigned long *)(sub_12484(&v6, a1 + 32) + 8) = 0xff0000000000;
                        if (a2 != 5)
                        {
                            sub_4fbd0(&v6, a1 + 40);
                            *(unsigned long *)(sub_12484(&v6, a1 + 40) + 8) = 0xff000000000000;
                            if (a2 != 6)
                            {
                                sub_4fbd0(&v6, a1 + 48);
                                *(unsigned long *)(sub_12484(&v6, a1 + 48) + 8) = 0xff00000000000000;
                            }
                        }
                    }
                }
            }
        }
    }
    (*(long long *)*a0)();
}
