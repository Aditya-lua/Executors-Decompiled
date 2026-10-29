/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ab144..0x9ab1d8 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ab144_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_9ab144_0;

typedef struct st_9ab144_2 {
    char padding_0[216];
    struct st_9ab144_1 *field_d8;
} st_9ab144_2;

typedef struct st_9ab144_3 {
    char padding_0[24];
    struct st_9ab144_2 *field_18;
    char padding_20[2451];
    char field_9b3;
} st_9ab144_3;

typedef struct st_9ab144_1 {
    char padding_0[80];
    char field_50;
} st_9ab144_1;


char sub_9ab144(st_9ab144_3 *a0, st_9ab144_0 *a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 4050, "tls_process_hello_req");
        sub_9a58a4(a0, 50, 159, 0);
        return 0;
    }
    if (a0->field_9b3 >> 6 & 1)
    {
        sub_957628();
    }
    else if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
    {
        sub_960990();
    }
    else
    {
        sub_9608e0();
    }
    return 1;
}
